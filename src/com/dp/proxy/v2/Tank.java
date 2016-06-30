package com.dp.proxy.v2;

import java.util.Random;

public class Tank implements Moveable{

	@Override
	public void move() {
		System.out.print("tank moving...");	
		try {
			Thread.sleep(new Random().nextInt(10000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void stop() {
		System.out.print("tank stop...");	
		try {
			Thread.sleep(new Random().nextInt(10000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}

	
   
}
