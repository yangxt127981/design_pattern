package com.dp.proxy.v3;

import java.util.Random;

public class Tank implements Moveable{

	@Override
	public void move() {
		System.out.println("tank moving...");	
		try {
			Thread.sleep(new Random().nextInt(10000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void stop() {
		System.out.println("tank stop...");	
		try {
			Thread.sleep(new Random().nextInt(10000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}

	
   
}
