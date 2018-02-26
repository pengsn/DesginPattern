package adapter;

public class SimpleTarget implements ITarget {

	@Override
	public void eat(String something) {
		System.out.println("i am simple target is eating.");
	}

}
