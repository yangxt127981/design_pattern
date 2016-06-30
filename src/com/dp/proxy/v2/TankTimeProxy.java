package com.dp.proxy.v2;public class TankTimeProxy implements com.dp.proxy.v2.Moveable{
private Moveable t;
public TankTimeProxy(Moveable t) {
	this.t = t;
}
@Override
public void move() {
long start = System.currentTimeMillis();
t.move();long end = System.currentTimeMillis();
System.out.println("total run time:"+(end-start));
}}