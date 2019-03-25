package calculator;

public abstract class Operation {
	abstract double execute(double x, double y);
	abstract String symbol();
	abstract String name();
}
