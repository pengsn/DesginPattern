package decorator;

public class AutoDecorator extends Decorator {

	@Override
	public void operator() {
		super.operator();
		System.out.println("I'am auto decorator");
	}
	
}
