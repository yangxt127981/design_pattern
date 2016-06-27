package com.dp.responsibilityChain.v2;

public class HtmlFilter implements Filter{

//	@Override
//	public String doFilter(String str) {
//		//process html tag <>
//		   String r = str.replace('<', '[').replace('>', ']');
//		   return r;
//	}

	@Override
	public void doFilter(Request req, Response res, FilterChain fc) {
		req.setResquestString(req.getResquestString().replace("<", "[").replace(">", "]")+"--htmlfilter");		
	    fc.doFilter(req, res, fc);
		res.setResponseString(res.getResponseString()+"--htmlfilter");
	}

}
