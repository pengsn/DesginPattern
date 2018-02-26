package facotry;

public class CalculateBusiness {
	
	private double num1;
	private double num2;
	private OperatorEnums op;
	
	public CalculateBusiness(String num1, String num2, OperatorEnums op)
	{
		try{
			this.op = op;
			this.num1 = Double.parseDouble(num1);
			this.num2 = Double.parseDouble(num2);
		}catch(Exception e)
		{
			
		}
	}
	
	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	public double calc()
	{
		return calc(num1, num2, op);
	}

	public double calc(double num1, double num2, OperatorEnums op)
	{
		double result = 0;
		IBusinessCalc ibc = BusinsessCalcFactory.getOperatorCalc(op);
		if(null == ibc)
		{
			return result;
		}
		try {
			result = ibc.calc(num1, num2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
}
