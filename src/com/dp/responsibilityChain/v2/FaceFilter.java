package com.dp.responsibilityChain.v2;

public class FaceFilter implements Filter{

	@Override
	public String doFilter(String str) {
		return str.replace("$", "^--^");
	}
  
}
