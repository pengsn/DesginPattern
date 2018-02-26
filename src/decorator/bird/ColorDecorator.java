package decorator.bird;

public class ColorDecorator extends AbstractDecorator {
	
	private Bird bird;
	
	public ColorDecorator(Bird bird) {
		this.bird = bird;
	}

	@Override
	public void describe() {
		super.describe();
		System.out.println("this is a red bird");
	} 
	
}
