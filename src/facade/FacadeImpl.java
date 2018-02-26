package facade;

public class FacadeImpl {
	
	SubSystemOne one = null;
	
	SubSystemTwo two = null;
	
	public FacadeImpl()
	{
		one = new SubSystemOne();
		two = new SubSystemTwo();
	}
	
	public void test()
	{
		System.out.println("testone");
		one.methodOne();
		two.methodTwo();
	}
	
	public void testone()
	{
		two.methodTwo();
		one.methodOne();
		System.out.println("testone");
	}
	
}
