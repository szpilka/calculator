package calculator;

public class Main {
	public static void main(String[] args) {
		System.out.println("Calculator");
		String input = "- 1 2";
		String[] splittedInput = input.split(" ");
		
		String operation = splittedInput[0];
		double x = Double.parseDouble(splittedInput[1]);
		double y = Double.parseDouble(splittedInput[2]);
		
		switch(operation) {
		case "+":
			System.out.println("Dodawanie");
			System.out.println(x+y);
			break;
		case "-":
			System.out.println("Odejmowanie");
			System.out.println(x-y);
			break;
		}
		
	}

}
