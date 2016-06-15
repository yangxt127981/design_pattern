package com.observe.v3;

public class App {

	public static void main(String[] args) {
		Dad d = new Dad();
		Child c = new Child();
		GrandFather gf = new GrandFather();
		c.addWakenUpListener(d);
		c.addWakenUpListener(gf);
		new Thread(c).start();
	}

}
