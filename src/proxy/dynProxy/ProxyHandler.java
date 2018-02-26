package proxy.dynProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyHandler implements InvocationHandler {

	private Object target;
	
	public Object getProxyPerson(Object target)
	{
		this.target = target;
		return Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), target.getClass().getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("前置处理");
		Object methodObj = null;
		methodObj = method.invoke(target, args);
		System.out.println("后置处理");
		return methodObj;
	}

}
