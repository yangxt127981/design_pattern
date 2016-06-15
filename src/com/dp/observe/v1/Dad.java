package com.dp.observe.v1;

public class Dad implements Runnable{
    private Child c;
	
    public Dad(Child c){
    	this.c = c;
    }
	public void feed(){
    	System.out.println("feed child");
    }

	@Override
	public void run() {
       
		try {
			while(!c.isWaken()){
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		
		feed();

	}
}
