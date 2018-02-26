package memento;

public class MainStart {
	
	public static void main(String[] args) {
		
		//备忘录模式
		//角色 ： 具体对象-> 记录备忘录 、 备忘录、 管理员 -> 管理备忘录
		ManagerMementos mms = new ManagerMementos();
		Memento m = new BigMemento();
		mms.attach(m);
		
		RealSub sub = new RealSub();
		String dowhat = sub.dosomething(": memento module");
		sub.setMemento(m, dowhat);
		m.read();
		
		dowhat = sub.dosomething(": er huo");
		sub.setMemento(m, dowhat);
		
		sub = null;
		m.read();
		
		m = null;
		
		m = mms.getMemto();
		m.read();
		
	}

}
