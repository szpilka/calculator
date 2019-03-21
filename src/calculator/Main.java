package calculator;

public class Main {
	public static void main(String[] args) {
		System.out.println("Calculator");
		String input = "- 1 2";
		String[] splittedInput = input.split(" ");

		String operationSymbol = splittedInput[0];
		double x = Double.parseDouble(splittedInput[1]);
		double y = Double.parseDouble(splittedInput[2]);

		Operation operation;

		switch (operationSymbol) {
		case "+":
			System.out.println("Dodawanie");
			operation = new Adding();
			break;
		case "-":
			System.out.println("Odejmowanie");
			operation = new Substracting();
			break;
		default:
			throw new IllegalArgumentException("Unrecognized operation symbol: " + operationSymbol);
		}

		System.out.println(operation.execute(x, y));

	}

}
