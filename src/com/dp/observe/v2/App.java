package com.dp.observe.v2;

public class App {

	public static void main(String[] args) {
		Dad d = new Dad();
		Child c = new Child(d);
		new Thread(c).start();
	}

}
