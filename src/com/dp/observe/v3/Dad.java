package com.dp.observe.v3;

public class Dad implements WakenUpListener{
  private Child c = new Child();
		
  public void actionToWakeUp(WakeUpEvent event){
	   System.out.println("feed child");
  }
	
}
