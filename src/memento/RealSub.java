package memento;

public class RealSub {
	
	public String dosomething(String name)
	{
		String remember = "this is real sub" + name;
		return remember;
	}
	
	public void setMemento(Memento m , String things)
	{
		m.write(things);
	}
	
}
