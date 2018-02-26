package observer;

public class TimeerSubject extends AbstractSubject {

	@Override
	public void update() {
		
		for(int i=0 ; i< 100; i ++ )
		{
			if(i % 10 == 0)
			{
				try {
					Thread.currentThread().sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				notifyObserver(System.currentTimeMillis()+"");
			}
		}
		
	}

}
