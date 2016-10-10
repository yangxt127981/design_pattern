package com.dp.itertor.v2;

public class SimuLinkList {
  Node head = null;
  int size = 0;
  public void add(Object o){
	  Node n = new Node(o,null); 
	  if(head == null){
		  head = n;
	  }
  }
  
  public int size(){
	  return 0;
  }
}
