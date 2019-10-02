package com.com.sxt.server.basic.servlet;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import com.sxt.server.basic.servlet.Entity;
import com.sxt.server.basic.servlet.Mapping;
import com.sxt.server.basic.servlet.Servlet;
import com.sxt.server.basic.servlet.WebContext;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * 熟悉SAX解析流程
 * 
 * @author 裴新 QQ:3401997271
 *
 */
public class XmlTest02 {

	public static void main(String[] args) throws Exception{
		//SAX解析
		//1、获取解析工厂
		SAXParserFactory factory=SAXParserFactory.newInstance();
		//2、从解析工厂获取解析器
		SAXParser parse =factory.newSAXParser();
		//3、编写处理器
		//4、加载文档 Document 注册处理器
		WebHandler handler=new WebHandler();
		//5、解析
		parse.parse(Thread.currentThread().getContextClassLoader()
		.getResourceAsStream("com/sxt/server/basic/servlet/web.xml")
		,handler);
		
		//获取数据
		com.sxt.server.basic.servlet.WebContext context = new WebContext(handler.getEntitys(),handler.getMappings());
		//假设你输入了 /login
		String className = context.getClz("/reg");
		Class clz =Class.forName(className);
		com.sxt.server.basic.servlet.Servlet servlet =(Servlet)clz.getConstructor().newInstance();
		System.out.println(servlet);
		servlet.service();
		
	}

}
class WebHandler extends DefaultHandler{
	private List<com.sxt.server.basic.servlet.Entity> entitys  = new ArrayList<com.sxt.server.basic.servlet.Entity>();
	private List<com.sxt.server.basic.servlet.Mapping> mappings = new ArrayList<com.sxt.server.basic.servlet.Mapping>();
	private com.sxt.server.basic.servlet.Entity entity ;
	private com.sxt.server.basic.servlet.Mapping mapping ;
	private String tag; //存储操作标签
	private boolean isMapping = false;
	
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if(null!=qName) {
			tag = qName; //存储标签名
			if(tag.equals("servlet")) {
				entity = new com.sxt.server.basic.servlet.Entity();
				isMapping = false;
			}else if(tag.equals("servlet-mapping")) {
				mapping = new com.sxt.server.basic.servlet.Mapping();
				isMapping = true;
			}
		}
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String contents = new String(ch,start,length).trim();
		//处理了空
		if(null!=tag) {
			if(isMapping) { //操作servlet-mapping
				if(tag.equals("servlet-name")) {
					mapping.setName(contents);
				}else if(tag.equals("url-pattern")) {
					mapping.addPattern(contents);
				}
			}else { //操作servlet
				if(tag.equals("servlet-name")) {
					entity.setName(contents);
				}else if(tag.equals("servlet-class")) {
					entity.setClz(contents);
				}
			}			
		}
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if(null!=qName) { 
			if(qName.equals("servlet")) {
				entitys.add(entity);
			}else if(qName.equals("servlet-mapping")) {
				mappings.add(mapping);
			}
		}
		tag = null; //tag丢弃了
	}

	public List<Entity> getEntitys() {
		return entitys;
	}

	public List<Mapping> getMappings() {
		return mappings;
	}	
	
}
