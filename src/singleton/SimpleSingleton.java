package singleton;

public class SimpleSingleton {
	
	private SimpleSingleton instance = null;
	
	private SimpleSingleton()
	{
	}
	
	public SimpleSingleton getInstance()
	{
		if(instance == null)
		{
			return new SimpleSingleton(); 
		}
		return instance;
	}
	
}
