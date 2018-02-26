package decorator.bird;

public abstract class AbstractDecorator implements Bird{
	
	private Bird bird;
	
	@Override
	public void describe()
	{
		if(null != bird)
		{
			bird.describe();
		}
	}
	
}
