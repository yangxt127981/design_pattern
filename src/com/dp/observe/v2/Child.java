package com.dp.observe.v2;

public class Child implements Runnable{
   private boolean waken = false;
   private Dad d;
   
   public Child(){
   }
   
   public Child(Dad d){
	   this.d= d;
   }
   public void wakeUp(){
	   waken = true;
	   d.feed(this);
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
