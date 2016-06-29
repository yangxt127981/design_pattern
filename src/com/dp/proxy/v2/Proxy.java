package com.dp.proxy.v2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

public class Proxy {
   public static Object newProxyInstance() throws IOException{
	   String rt="\r\n";
	   String src = "package com.dp.proxy.v2;"
       +"public class TankTimeProxy implements Moveable{"+ rt+
       "private Moveable t;"+ rt +
	    
		"public TankTimeProxy(Tank t) {"+ rt+
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
	   
	   JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
	   System.out.println(compiler);
	   StandardJavaFileManager fileMgr = compiler.getStandardFileManager(null, null, null);
	   Iterable units = fileMgr.getJavaFileObjects(fileName);
	   CompilationTask t = compiler.getTask(null, fileMgr, null, null, null, units);
	   
	   return null;
   }
}
