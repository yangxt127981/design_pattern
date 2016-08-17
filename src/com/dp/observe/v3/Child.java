package com.dp.observe.v3;

import java.util.ArrayList;
import java.util.List;
/*use event listener design, when add a new listeners, don;t need to change child code*/
public class Child implements Runnable{
   private List<WakenUpListener> wakenUpListeners = new ArrayList<WakenUpListener>();
   
   public void addWakenUpListener(WakenUpListener l){
	   wakenUpListeners.add(l);
   }
   
   public Child(){
   }
   
  
   public void wakeUp(){
	   for(int i =0;i<wakenUpListeners.size();i++){
		   WakenUpListener l = wakenUpListeners.get(i);
		   l.actionToWakeUp(new WakeUpEvent(System.currentTimeMillis(),"bed",this));
	   }
   }
   
	@Override
	public void run() {
       try {
    	   	Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
       wakeUp();
	}

	
}
