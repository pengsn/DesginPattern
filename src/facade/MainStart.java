package facade;

public class MainStart {
	
	public static void main(String[] args)
	{
		System.out.println(".......");
		FacadeImpl face = new FacadeImpl();
		
	
		System.out.println("test ... ");
		face.test();
		
		System.out.println();
		System.out.println("ttt");
		
		face.testone();
	}
	
}
