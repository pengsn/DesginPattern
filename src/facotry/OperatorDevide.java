package facotry;

public class OperatorDevide implements IBusinessCalc {

	@Override
	public double calc(double num1, double num2) throws Exception {
		if(num2 == 0)
		{
			throw new Exception("除数不能为0");
		}else
		{
			return num1 / num2;
		}
	}

}
