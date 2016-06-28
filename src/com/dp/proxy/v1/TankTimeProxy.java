package com.dp.proxy.v1;

public class TankTimeProxy implements Moveable{
    private Moveable t;
	public TankTimeProxy(Tank t) {
		this.t = t;
	}
	@Override
	public void move() {
		long start = System.currentTimeMillis();
		t.move();	
		long end = System.currentTimeMillis();
		System.out.println("total run time:"+(end-start));	
	}

}
