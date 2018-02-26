package facotry;

public class CalculateStart {
	
	public static void main(String[] args)
	{
		CalculateBusiness cb = new CalculateBusiness("1", "2", OperatorEnums.ADD);
		System.out.println(cb.calc());
		
		cb = new CalculateBusiness("1", "2", OperatorEnums.SUB);
		System.out.println(cb.calc());
		
		cb = new CalculateBusiness("1", "2", OperatorEnums.MULTIPLY);
		System.out.println(cb.calc());
		
		cb = new CalculateBusiness("1", "a", OperatorEnums.DIVIDE);
		System.out.println(cb.calc());
	}
	
}
