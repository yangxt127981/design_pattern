package com.dp.proxy.v3;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

public class Proxy {
   public static Object newProxyInstance(Class infce, InvocationHandler h) throws Exception{
	   String methodStr = "";
	   String rt="\r\n";

	   Method[] methods = infce.getMethods();
	   /*only can dealt with time proxy, if need other proxy, can not extensible
	    for(Method m:methods){
	    	methodStr += "@Override" + rt 
	    			     + "public void " + m.getName()
	    			     +"() {" + rt +
	    			     "long start = System.currentTimeMillis();"+ rt +
    					 "t."+ m.getName() +"();" + rt +
	    				 "long end = System.currentTimeMillis();"+ rt +
	    				 "System.out.println(\"total run time:\"+(end-start));"+rt
	    				 
	    			     
	    			     + "}";
	    }
	    */
	   for(Method m:methods){
	    	methodStr += "@Override" + rt 
	    			     + "public void " + m.getName()
	    			     +"() {" + rt +
	    			     " try{ Method md = " + infce.getName() + ".class.getMethod(\""
	    			     + m.getName() 
	    			     +"\");"+ rt +
	    			     "h.invoke(this,md);" + rt
	    			     +"} catch(Exception e){" +rt +
	    			     "e.printStackTrace();" + rt +
	    			     "}" + rt + "}";
	   }
	   String src = "package com.dp.proxy.v3;" + rt +
			       "import java.lang.reflect.Method;" + rt 
			       +"public class $Proxy1 implements "+infce.getName()+"{"+ rt+
			       "private com.dp.proxy.v3.InvocationHandler h;"+ rt +
     				"public $Proxy1(InvocationHandler h) {"+ rt+
					"	this.h = h;"+ rt +
					"}"+ rt+
					methodStr
					+"}";
	   
	   String fileName = "d:/src/com/dp/proxy/v3/$Proxy1.java";
	   File f = new File(fileName);
	   FileWriter fw = new FileWriter(f);
	   fw.write(src);
	   fw.flush();
	   fw.close();
	   
	   //compile
	   JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
	   System.out.println(compiler);
	   StandardJavaFileManager fileMgr = compiler.getStandardFileManager(null, null, null);
	   Iterable units = fileMgr.getJavaFileObjects(fileName);
	   CompilationTask t = compiler.getTask(null, fileMgr, null, null, null, units);
	   t.call();
	   fileMgr.close();
	   
	   //load into memory and generate instance
	   URL[] urls = new URL[] {new URL("file:/"+"d:/src/")};
	   System.out.println("urls"+urls[0]);
	   URLClassLoader ul = new URLClassLoader(urls);
	   Class c = ul.loadClass("com.dp.proxy.v3.$Proxy1");
       
	   Constructor ctr = c.getConstructor(InvocationHandler.class);
       Object o = ctr.newInstance(h);
       //m.move();
	   return o;
   }
}

