package com.dp.proxy.v1;

public class TankLogProxy implements Moveable{
    private Moveable t;
	public TankLogProxy(Moveable t) {
		this.t = t;
	}
	@Override
	public void move() {
		System.out.println("log:tank start");	
		t.move();	
		System.out.println("log:tank end");	
	}

}
