package facotry;

public class OperatorSub implements IBusinessCalc {

	@Override
	public double calc(double num1, double num2) {
		return num1 - num2;
	}

}
