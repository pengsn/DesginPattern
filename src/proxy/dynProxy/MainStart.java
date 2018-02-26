package proxy.dynProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.FixedValue;

public class MainStart {
	
	public static void main(String []args)
	{
		/*Student s = new Student(20, "liuxiang");
		ProxyHandler h = new ProxyHandler();
		Person o = (Person)h.getProxyPerson(s);
		o.eat("装饰");
		
		MethodHandler h1 = new MethodHandler();
		Person o1 = (Person)h1.getProxyInstance(s);
		o1.eat("装饰12");
		*/
		test();
	}
	
	public static void test()
	{
		Enhancer eh = new Enhancer();
		eh.setCallback(new FixedValue() {
			
			@Override
			public Object loadObject() throws Exception {
				return "6666666666";
			}
		});
		eh.setSuperclass(SimpleCalss.class);
		SimpleCalss scc = (SimpleCalss)eh.create();
		String show = scc.test("enhancer");
		System.out.println(show);
	}
	
}

class SimpleCalss 
{
	public String test(String name)
	{
		System.out.println("coming to test , " + name);
		return "simpleclass test";
	}
}