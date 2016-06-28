package com.dp.proxy.v1;

public class App {

	public static void main(String[] args) {
        Tank t = new Tank();
        TankTimeProxy ttp = new TankTimeProxy(t);
        TankLogProxy tlp = new TankLogProxy(ttp);
        Moveable m = tlp;
        m.move();
	}

}
