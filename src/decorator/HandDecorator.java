package decorator;

public class HandDecorator extends Decorator {
	@Override
	public void operator() {
		super.operator();
		System.out.println("I'am auto HandDecorator");
	}
}
