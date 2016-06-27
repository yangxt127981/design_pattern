package com.dp.responsibilityChain.v2;

public interface Filter {
   public void doFilter(Request req, Response res, FilterChain chain);
}
