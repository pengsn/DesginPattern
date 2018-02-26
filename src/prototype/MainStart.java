package prototype;

public class MainStart {

	public static void main(String[] args) {
		
		Person s = new Student();
		
		Person ss = (Person)s.clone();
		
		Person sss = s;

		System.out.println("hash s : " + s.toString() + ";" + s.hashCode());
		
		System.out.println("hash ss : " + ss.toString() + ";" + ss.hashCode());
		
		System.out.println("test sss : " + sss.toString() + ";" + sss.hashCode());
	}

}
