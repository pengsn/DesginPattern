package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
	
	List<Component> list = new ArrayList<Component>();
	
	String name = "";

	public Composite(String name)
	{
		this.name = name;
	}
	
	@Override
	public void add(Component c) {
		list.add(c);
	}

	@Override
	public void remove(Component c) {
		list.remove(c);
	}

	@Override
	public void display(Component c) {
		System.out.println("this is Composite  ： " + name);
		for(Component clist : list)
		{
			clist.display(clist);
		}
	}


}
