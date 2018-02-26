package proxy.dynProxy;

public class Student implements Person {

	private int age;
	
	private String name;
	
	public Student()
	{
	}
	
	public Student(int age, String name)
	{
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String eat(String some) {
		System.out.println("this student is :  " + name + "; age is " + age);
		return name;
	}

}
