package com.dp.proxy.v2;


public class App {

	public static void main(String[] args) throws Exception {
        Tank t = new Tank();
        //can generate any class proxy, pass interface as parameter
        Moveable m =(Moveable) Proxy.newProxyInstance(Moveable.class);
        m.move();
	}

}
