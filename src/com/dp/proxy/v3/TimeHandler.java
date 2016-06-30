package com.dp.proxy.v3;

import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler{
    private Object target;
	
	public TimeHandler(Object target) {
		this.target = target;
	}

	@Override
	public void invoke(Object o, Method m){
		System.out.println(o.getClass().getName());		

		long start = System.currentTimeMillis();
		System.out.println("Tank start on:" +start);		

		try {
			m.invoke(target);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 	
		long end = System.currentTimeMillis();
		System.out.println("Tank end on:" +end);		
		System.out.println("total run time:"+(end-start));		
	}

}
