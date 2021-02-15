package myspring.di.xml.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import myspring.di.xml.Hello;
import myspring.di.xml.Printer;

public class HelloBeanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// IoC container 생성
		ApplicationContext context = new GenericXmlApplicationContext("config/beans.xml");
		// Hello Bean 가져오기
		Hello hello = (Hello) context.getBean("hello");
		System.out.println(hello.sayHello());
		hello.print();
		// StringPrinter Bean 가져오기
		Printer printer = (Printer) context.getBean("printer");
		System.out.println(printer.toString());
		
		Hello hello2 = context.getBean("hello", Hello.class);
		hello2.print();
		
		System.out.println(hello == hello2);
	}

}
