package proxy;

public class MainStart {

	public static void main(String[] args) {
		
		RealSubject real = new RealSubject();
		
		ProxySubject proxy = new ProxySubject(real);
		
		String str = proxy.getData("something.");
		
		System.out.println(str);
		
		
		
	}

}
