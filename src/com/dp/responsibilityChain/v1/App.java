package com.dp.responsibilityChain.v1;

public class App {

	public static void main(String[] args) {
         String msg = "hello everyone$<script>, fuck";
         MsgProcessor mp = new MsgProcessor();
         
         FilterChain fc = new FilterChain();
         
         FilterChain fc2 = new FilterChain();
         fc2.addFilter(new FaceFilter());
         /*filter chain is also a filter, so a filter chain 
          * can merge to another filter chain */
         
         fc.addFilter(new HtmlFilter())
         .addFilter(fc2)
         .addFilter(new SensitiveFilter());
         
         mp.setFc(fc);
         String result = mp.process(msg);

         System.out.println(result);
	}

}
