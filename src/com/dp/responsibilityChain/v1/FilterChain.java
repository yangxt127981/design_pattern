package com.dp.responsibilityChain.v1;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter{
   List<Filter> filters = new ArrayList<Filter>();
   
   public FilterChain addFilter(Filter f){
	   filters.add(f);
	   return this;
   }
   
   public String doFilter(String str){
	   for(Filter f:filters){
			str = f.doFilter(str);
		}
	   
	   return str;
   }
}
