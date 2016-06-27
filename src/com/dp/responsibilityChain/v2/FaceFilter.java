package com.dp.responsibilityChain.v2;

public class FaceFilter implements Filter{

	@Override
	public void doFilter(Request req, Response res, FilterChain fc) {
       req.setResquestString(req.getResquestString().replace("$", "^_^")+"--face filter");		
	   fc.doFilter(req, res, fc);
       res.setResponseString(res.getResponseString()+"--facefilter");
	}

	
  
}
