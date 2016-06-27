package com.dp.responsibilityChain.v2;

public class App {
   /*simulate web filter, order: request: htmlfilter, sensitive filter, face filter
    * response: face filter, sensitive filter, html filter*/
	public static void main(String[] args) {
         String msg = "hello everyone$<script>, fuck";
         Request req = new Request();
         req.setResquestString(msg);
         Response res = new Response();
         res.setResponseString("reponse");
         
         FilterChain fc = new FilterChain();
         
                
         fc.addFilter(new HtmlFilter())
         .addFilter(new SensitiveFilter())
         .addFilter(new FaceFilter());
         
         fc.doFilter(req, res,fc);
         System.out.println(req.getResquestString());
         System.out.println(res.getResponseString());

	}

}
