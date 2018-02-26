package composite;

public class MainStart {

	public static void main(String[] args) {
		
		Component c = new Composite("总部"); // 总部
		
		Component cc = new Leaf("人力"); // 人力
		c.add(cc);
		Component cc1 = new Leaf("行政"); //行政
		c.add(cc1);
		
		Component d = new Composite("杭州");//杭州
		Component dd = new Leaf("杭州人力"); //杭州人力
		d.add(dd);
		Component dd1 = new Leaf("杭州行政"); //杭州行政
		d.add(dd1);
		
		c.add(d);
		
		c.display(null);
		
	}

}
