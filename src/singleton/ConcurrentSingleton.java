package singleton;

public class ConcurrentSingleton {
	
	private ConcurrentSingleton instance;
	
	
	private ConcurrentSingleton()
	{
		
	}
	
	public ConcurrentSingleton getInstance()
	{
		if(instance == null)
		{
			synchronized (this) {
				if(instance == null)
				{
					return new ConcurrentSingleton();
				}
			}
		}
		return instance;
	}
	
}
