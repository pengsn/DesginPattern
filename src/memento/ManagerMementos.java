package memento;

import java.util.ArrayList;
import java.util.List;

public class ManagerMementos {
	
	private List<Memento> list = new ArrayList<Memento>();
	
	public void attach(Memento memento)
	{
		list.add(memento);
	}
	
	public Memento getMemto()
	{
		return list.get(0);
	}
	
}
