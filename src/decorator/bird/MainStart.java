package decorator.bird;

public class MainStart {

	public static void main(String[] args) {
		Bird bird = new SizeDecorator(new ColorDecorator(new MaQue()));
		bird.describe();
	}

}
