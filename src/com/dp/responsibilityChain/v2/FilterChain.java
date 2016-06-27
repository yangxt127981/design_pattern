package com.dp.responsibilityChain.v2;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter{
   List<Filter> filters = new ArrayList<Filter>();
   int index = 0;
   public FilterChain addFilter(Filter f){
	   filters.add(f);
	   return this;
   }

@Override
public void doFilter(Request req, Response res, FilterChain fc) {
	if(index == filters.size())
		return;
	Filter f = filters.get(index);
	index++;
	f.doFilter(req, res, fc);
	
}

}
