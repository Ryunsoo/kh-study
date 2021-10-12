package test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("test01/applicationContext.xml");
		
		Wheel wheel = context.getBean("wheelBean", Wheel.class);
		wheel.setRadius(10000);
		System.out.println(context.getBean("wheelBean2"));
		System.out.println(context.getBean("car")); //id명은 클래스명을 따라간다.
		
	}
}
