package com.dp.responsibilityChain.v2;

public class HtmlFilter implements Filter{

	@Override
	public String doFilter(String str) {
		//process html tag <>
		   String r = str.replace('<', '[').replace('>', ']');
		   return r;
	}

}
