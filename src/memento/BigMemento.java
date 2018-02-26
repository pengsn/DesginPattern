package memento;

public class BigMemento implements Memento {
	
	private Object o ;
	
	@Override
	public void write(Object o) {
		this.o = o;
	}

	@Override
	public void read() {
		System.out.println("last time write is " + o.toString());
	}

}
