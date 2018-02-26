package composite;

public class Leaf extends AbstractComp {
	
	String name = "";

	public Leaf(String name)
	{
		this.name = name;
	}
	
	@Override
	public void display(Component c) {
		System.out.println("this is leaf dept : " + name);
	}

}
