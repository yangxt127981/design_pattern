package com.dp.proxy.v3;


public class App {

	public static void main(String[] args) throws Exception {
        /*can generate any class proxy, pass interface as parameter
         you can not see specified proxy class**/
		Tank t = new Tank();
		InvocationHandler h = new TimeHandler(t);
        Moveable m =(Moveable) Proxy.newProxyInstance(Moveable.class, h);
        m.move();
        m.stop();
	}

}
