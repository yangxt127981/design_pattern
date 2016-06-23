package com.dp.responsibilityChain;

public class FaceFilter implements Filter{

	@Override
	public String doFilter(String str) {
		return str.replace("$", "^--^");
	}
  
}
