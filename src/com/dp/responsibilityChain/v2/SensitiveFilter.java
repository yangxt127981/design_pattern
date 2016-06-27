package com.dp.responsibilityChain.v2;

public class SensitiveFilter implements Filter{

	@Override
	public void doFilter(Request req, Response res, FilterChain fc) {
		req.setResquestString(req.getResquestString().replace("fuck", "****")+"--sensitive filter");		
	    fc.doFilter(req, res, fc);
		res.setResponseString(res.getResponseString()+"--sensitive filter");
	}

}
