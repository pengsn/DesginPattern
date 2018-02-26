package facotry;

public enum OperatorEnums {
	
	ADD("+", OperatorAdd.class),
	SUB("-", OperatorSub.class),
	MULTIPLY("*", OperatorMultiply.class),
	DIVIDE("/", OperatorDevide.class);
	
	private OperatorEnums(String opt, Class clazz)
	{
		this.opt  = opt;
		this.clazz = clazz;
	}
	
	private String opt;
	
	private Class clazz;

	public String getOpt() {
		return opt;
	}

	public void setOpt(String opt) {
		this.opt = opt;
	}

	public Class getClazz() {
		return clazz;
	}

	public void setClazz(Class clazz) {
		this.clazz = clazz;
	}
	
}
