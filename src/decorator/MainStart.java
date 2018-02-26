package decorator;

public class MainStart {
	
	public static void main(String[]args)
	{
		AutoDecorator ad = new AutoDecorator();
		HandDecorator hd = new HandDecorator();
		
		CustomPerson cp = new CustomPerson(2, "test");
		
		ad.addDecoratorObj(cp);
		hd.addDecoratorObj(ad);
		
		hd.operator();
	
	}
	
}
