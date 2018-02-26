package observer;

import java.util.Date;

public class MainStart {

	public static void main(String[] args) {
		
		TimeerSubject ts = new TimeerSubject();
		
		ts.attach(new IObserver() {
			
			@Override
			public void update(String key) {
				System.out.println("===================================observer1 " + new Date(Long.parseLong(key)));
			}
		});
		
		ts.attach(new IObserver() {
			
			@Override
			public void update(String key) {
				System.out.println("observer2 : " + new Date(Long.parseLong(key)));
			}
		});
		ts.update();
	}

}
