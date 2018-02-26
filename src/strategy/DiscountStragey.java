package strategy;

public class DiscountStragey implements Strategy {
	
	private double discount = 1;
	
	public DiscountStragey(double discount)
	{
		this.discount = discount;
	}
	
	@Override
	public double calc(double money) {
		return money * discount;
	}

}
