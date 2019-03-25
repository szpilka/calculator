package calculator;

public class Adding extends Operation {
	@Override
	double execute(double x, double y) {
		return x + y;
	}

	@Override
	String symbol() {
		return "+";
	}

	@Override
	String name() {
		return "Dodawanie";
	}
}
