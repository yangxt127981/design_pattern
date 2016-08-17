package com.dp.itertor.v1;

public class SimuArrayList {
   /*simulator arraylist*/
	Object[] objects = new Object[10];
	int index = 0;
	public void add(Object o){
		if(index == objects.length){
			Object[] newObjects = new Object[objects.length*2];
			System.arraycopy(objects, 0, newObjects, 0, objects.length);
		    objects = newObjects;
		}
		objects[index] = o;
		index++;
	}
	
	public int size(){
		return index;
	}
}
