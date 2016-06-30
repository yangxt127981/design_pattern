package com.dp.proxy.v2;


public class App {

	public static void main(String[] args) throws Exception {
        /*can generate any class proxy, pass interface as parameter
         you can not see specified proxy class**/
        Moveable m =(Moveable) Proxy.newProxyInstance(Moveable.class);
        m.move();
        m.stop();
	}

}
