package com.dp.observe.v3;

public class WakeUpEvent {
	private long time;
	private String loc;
	
	public WakeUpEvent(long time, String loc, Child source) {
		this.time = time;
		this.loc = loc;
		this.source = source;
	}
	private Child source;
   
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public Child getSource() {
		return source;
	}
	public void setSource(Child source) {
		this.source = source;
	}

}
