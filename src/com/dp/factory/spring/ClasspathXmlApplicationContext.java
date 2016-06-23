package com.dp.factory.spring;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.xpath.XPath;

public class ClasspathXmlApplicationContext implements BeanFactory {
    private Map<String, Object> container = new HashMap<String, Object>();
	
	public ClasspathXmlApplicationContext(String fileName) throws Exception{
    	SAXBuilder sb = new SAXBuilder();
    	Document doc = sb.build(this.getClass().getClassLoader().getResourceAsStream(fileName));
        Element root = doc.getRootElement();
        System.out.println(root);
        List list = XPath.selectNodes(root, "/beans/bean");
        for(int i=0; i<list.size();i++){
        	Element bean = (Element)list.get(i);
        	String id = bean.getAttributeValue("id");
        	String name = bean.getAttributeValue("class");
            System.out.println(id);
            System.out.println(name);
            Object o = Class.forName(name).newInstance();
        	container.put(id, o);
        }
    }
    
	@Override
	public Object getBean(String id) {
	    return container.get(id);
	}

}
