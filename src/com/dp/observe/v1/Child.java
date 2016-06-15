package com.dp.observe.v1;

public class Child implements Runnable{
   private boolean waken = false;
   
   public void wakeUp(){
	   waken = true;
   }

	@Override
	public void run() {
       try {
		Thread.sleep(5000);
	    wakeUp();

	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}

	public boolean isWaken() {
		return waken;
	}

	public void setWaken(boolean waken) {
		this.waken = waken;
	}
}
