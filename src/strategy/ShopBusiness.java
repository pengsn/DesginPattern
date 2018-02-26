package strategy;

public class ShopBusiness {
	
	private double total;
	
	private double discount = 1;
	
	public void showTotal()
	{
		System.out.println("now total is ： " +  total);
	}
	
	public ShopBusiness()
	{
	}
	
	public ShopBusiness(double discount)
	{
		this.discount = discount;
	}
	
	public void submit(double price, int count, Strategy strategy)
	{
		total += price * count * discount;
		showTotal();
	}
	
	public void reset()
	{
		total = 0;
	}
}
