package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSubject implements ISubject {

	private List<IObserver> observers = new ArrayList<IObserver>();
	
	public void attach(IObserver observer)
	{
		observers.add(observer);
	}
	
	public void detach(IObserver observer)
	{
		observers.remove(observer);
	}
	
	public abstract void update();
	
	public void notifyObserver(String timeer)
	{
		for(IObserver o : observers)
		{
			o.update(timeer);
		}
	}
	
}
