package calculator;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		System.out.println("Calculator");
		String input = "+ 5 2";
		String[] splittedInput = input.split(" ");

		String operationSymbol = splittedInput[0];
		double x = Double.parseDouble(splittedInput[1]);
		double y = Double.parseDouble(splittedInput[2]);
		List<Operation> operations = new ArrayList<Operation>();
		operations.add(new Adding());
		operations.add(new Substracting());

		Operation operation = null;
		for (Operation potentialOperation : operations) {
			if (potentialOperation.symbol().equals(operationSymbol)) {
				operation = potentialOperation;
			
				break;
			}

		}
		if (operation == null) {
			throw new IllegalStateException("Illegal operation symbol: " + operationSymbol);
		}

	
        System.out.println(operation.name());
		System.out.println(operation.execute(x, y));

	}

}
