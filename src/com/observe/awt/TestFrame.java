package com.observe.awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestFrame extends Frame{
  public void launch(){
	  Button b = new Button("Press");
	  b.addActionListener(new MyActionListener2());
	  b.addActionListener(new ActionListener(){
		  public void actionPerformed(ActionEvent arg0) {
	        	System.out.println("button pressed");	
		}
	  });

	  this.add(b);
	  this.pack();
	  this.setVisible(true);
	  this.addWindowListener(new MyWindowListener());
  }
  
  public static void main(String[] args){
	  new TestFrame().launch();
  }
  private class MyWindowListener extends WindowAdapter{

	  public void windowClosing(WindowEvent e){
			System.exit(0);
		}
		  
	  }
  private class MyActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
        	System.out.println("button pressed");	
	}
	  
  }
  
  private class MyActionListener2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
	        	System.out.println("button2 pressed");	
		}
		  
	  }
}
