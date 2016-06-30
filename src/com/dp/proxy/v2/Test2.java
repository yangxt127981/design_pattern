package com.dp.proxy.v2;

import java.lang.reflect.Method;

public class Test2 {

	public static void main(String[] args) {
		Method[] methods = com.dp.proxy.v2.Moveable.class.getMethods();
	    for(Method m:methods){
	    	System.out.println(m);
	    }
	}

}
