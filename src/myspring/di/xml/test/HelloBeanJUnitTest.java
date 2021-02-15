package myspring.di.xml.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import myspring.di.xml.Hello;
import myspring.di.xml.Printer;

public class HelloBeanJUnitTest {
	ApplicationContext context;
	
	@Before
	public void init() {
		// IoC container 생성
		context = new GenericXmlApplicationContext("config/beans.xml");
	}
	
	@Test @Ignore
	public void test2() {
		Hello hello = (Hello) context.getBean("hello");
		Hello hello2 = (Hello) context.getBean("hello");
		
		assertSame(hello, hello2);
	}
	
	@Test
	public void test1() {
		// TODO Auto-generated method stub
		// Hello Bean 가져오기
		Hello hello = (Hello) context.getBean("hello");
		assertEquals("Hello Spring", hello.sayHello());
		hello.print();
		// StringPrinter Bean 가져오기
		Printer printer = (Printer) context.getBean("printer");
		assertEquals("Hello Spring", printer.toString());
	}

}
