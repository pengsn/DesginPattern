package prototype;

public class School implements Cloneable{
	
	
	private String name;
	
	private Student stu;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student getStu() {
		return stu;
	}

	public void setStu(Student stu) {
		this.stu = stu;
	}
	
}
