package org.fkjava.ws.call;

import javax.servlet.ServletContext;

import org.fkjava.cxf.ws.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

@Service
public class CallServiceImpl implements CallService {
	
	@Autowired
	private ServletContext servletContext;
	CallServiceImpl() {
		System.out.println("creating bean CallServiceImpl:"+this);
	}
	public String sayHello(String name) {
		
		WebApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);
		//ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:applicationContext-cxf-client.xml");
		HelloWorld hw = null;
		hw =(HelloWorld) applicationContext.getBean("helloWorldClient");
		System.out.println(hw.sayHello(name)+"--------------------------------");
		return hw.sayHello(name);
	}
	public static void main(String[] args) {
		CallServiceImpl cs = new CallServiceImpl();
		cs.sayHello("zhangsan");
		
	}

}
