package decorator;

public class CustomPerson implements Component {

	private int age;
	
	private String name ;
	
	public CustomPerson(int age, String name)
	{
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString()
	{
		return "" + this.name + "; age is " + this.age;
	}

	@Override
	public void operator() {
		System.out.println("" + toString());
	}
}
