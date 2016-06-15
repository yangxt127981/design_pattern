package com.dp.observe.v1;

public class App {

	public static void main(String[] args) {
		Child c = new Child();
		new Thread(c).start();
		new Thread(new Dad(c)).start();
	}

}
