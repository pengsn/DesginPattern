package decorator;

public abstract class Decorator implements Component{
	
	public Component c ;
	
	public void addDecoratorObj(Component c)
	{
		this.c = c;
	}
	
	public void operator()
	{
		if(null != c)
		{
			c.operator();
		}
	}
	
	
}
