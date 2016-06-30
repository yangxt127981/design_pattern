package com.dp.proxy.v2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

public class Proxy {
   public static Object newProxyInstance(Class infce) throws Exception{
	   String rt="\r\n";
	   String src = "package com.dp.proxy.v2;"
       +"public class TankTimeProxy implements "+infce.getName()+"{"+ rt+
       "private Moveable t;"+ rt +
	    
		"public TankTimeProxy(Moveable t) {"+ rt+
		"	this.t = t;"+ rt +
		"}"+ rt+
		
		"@Override"+ rt +
		"public void move() {"+ rt +
			"long start = System.currentTimeMillis();"+ rt +
			"t.move();"+	
			"long end = System.currentTimeMillis();"+ rt +
			"System.out.println(\"total run time:\"+(end-start));"+	rt+
		"}"+"}";
	   String fileName = System.getProperty("user.dir")
			   +"/src/com/dp/proxy/v2/TankTimeProxy.java";
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
	   URL[] urls = new URL[] {new URL("file:/"+System.getProperty("user.dir")+"/src")};
	   System.out.println("urls"+urls[0]);
	   URLClassLoader ul = new URLClassLoader(urls);
	   Class c = ul.loadClass("com.dp.proxy.v2.TankTimeProxy");
       
	   Constructor ctr = c.getConstructor(Moveable.class);
       Moveable m = (Moveable)ctr.newInstance(new Tank());
       m.move();
	   return null;
   }
}
