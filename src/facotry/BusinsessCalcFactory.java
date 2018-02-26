package facotry;

public class BusinsessCalcFactory {
	
	public static IBusinessCalc getOperatorCalc(OperatorEnums op)
	{
		Class cl = op.getClazz();
		try {
			return (IBusinessCalc) cl.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
