package proxy;

public class RealSubject implements ISubject {

	@Override
	public String getData(String name) {
		System.out.println("this is real subject things");
		return "I am real name " + name;
	}

}
