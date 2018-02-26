package facotry;

public class OperatorMultiply implements IBusinessCalc {

	@Override
	public double calc(double num1, double num2) {
		return num1 * num2;
	}

}
