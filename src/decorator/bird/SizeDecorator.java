package decorator.bird;

public class SizeDecorator extends AbstractDecorator {

	public SizeDecorator(Bird bird) {
	}

	@Override
	public void describe() {
		super.describe();
		System.out.println("this is a litter bird");
	}
	
	
}
