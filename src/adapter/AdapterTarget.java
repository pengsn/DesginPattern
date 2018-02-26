package adapter;

public class AdapterTarget implements ITarget {
	
	Product p = new Product();
	
	@Override
	public void eat(String something) {
		System.out.println("adapter target is eating" + something);
		p.test();
	}

}
