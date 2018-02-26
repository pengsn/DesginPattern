package proxy.dynProxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class MethodHandler implements MethodInterceptor {

	private Object targetObj;
	
	public Object getProxyInstance(Object target)
	{
		this.targetObj = target;
		return Enhancer.create(target.getClass(), this);
	}
	
	@Override
	public Object intercept(Object proxy, Method method, Object[] arg2, MethodProxy methodProxy) throws Throwable {
		System.out.println("前置处理");
		Object methodObj = methodProxy.invoke(targetObj, arg2);
		System.out.println("后置处理");
		return methodObj;
	}

}
