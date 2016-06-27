package com.dp.responsibilityChain.v1;

public class SensitiveFilter implements Filter{

	@Override
	public String doFilter(String str) {
		//process sensitive word
 	    return str.replace("fuck", "****");	
 	    
	}

}
