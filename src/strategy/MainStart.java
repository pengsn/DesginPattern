package strategy;

public class MainStart {

	public static void test(String[] args) {
		ShopBusiness sb = new ShopBusiness(1);
	}
	
	public static void main(String[] args) {
		Business b = new Business();
		b.getDiffBusiness(StrategyEnums.discount);
		System.out.println("discount 0.8 : " + b.getSgy().calc(80));
		
	}

}
