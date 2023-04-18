package Ref_DI_UsingConstructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext=new ClassPathXmlApplicationContext("Ref_DI_UsingConstructor/beans.xml");
		Student student21 = classPathXmlApplicationContext.getBean("student",Student.class);
		System.out.println(student21);
		
		
		Addresss address = classPathXmlApplicationContext.getBean("address",Addresss.class);
		System.out.println(address);
		
	}
	}


