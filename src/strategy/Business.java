package strategy;

public class Business {
	
	private Strategy sgy = null;
	
	public Business getDiffBusiness(StrategyEnums strategy)
	{
		
		switch(strategy)
		{
			case discount:
				sgy = new DiscountStragey(0.8);
				break;
			default:
				break;
		}
		return null;
	}

	public Strategy getSgy() {
		return sgy;
	}

	public void setSgy(Strategy sgy) {
		this.sgy = sgy;
	}
	
}
