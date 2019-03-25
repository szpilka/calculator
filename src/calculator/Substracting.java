package calculator;

public class Substracting extends Operation {
	@Override
	double execute(double x, double y) {
		return x - y;
	}

	@Override
	String symbol() {
		return "-";
	}

	@Override
	String name() {
		return "Odejmowanie";
	}
}
