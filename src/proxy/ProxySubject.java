package proxy;

public class ProxySubject implements ISubject{
	
	public ISubject subject;
	
	public ProxySubject(ISubject isub)
	{
		this.subject = isub;
	}

	@Override
	public String getData(String name) {
		System.out.println("this is proxy subject. ");
		return subject.getData(name);
	}
	
	
	
}
