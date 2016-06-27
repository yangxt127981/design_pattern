package com.dp.responsibilityChain.v1;

public class MsgProcessor {
    private String msg;
	//filter can change sequence, can add new filter
    //private Filter[] filters = {new HtmlFilter(),new SensitiveFilter(),new FaceFilter()};
	
    private FilterChain fc;
    public FilterChain getFc() {
		return fc;
	}

	public void setFc(FilterChain fc) {
		this.fc = fc;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String process(String s){
		/*string process need to extensibility*/
		
//		//process html tag <>
//	   String r = s.replace('<', '[').replace('>', ']');
//       
//	   //process sensitive word
//	   r= r.replace("fuck", "****");
		
//		String r= null;
//		for(Filter f:filters){
//			r = f.doFilter(s);
//		}
//	   return r;
		
		
		return fc.doFilter(s);
   }
}
