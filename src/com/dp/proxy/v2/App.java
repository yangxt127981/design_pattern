package com.dp.proxy.v2;

import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
        Tank t = new Tank();
        Moveable m =(Moveable) Proxy.newProxyInstance();
        m.move();
	}

}
