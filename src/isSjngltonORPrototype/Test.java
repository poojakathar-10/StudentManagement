package isSjngltonORPrototype;
import in.Annotation.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.Annotation.Person;

public class Test {



	public static void main(String[] args) {
		
		ApplicationContext apc= new AnnotationConfigApplicationContext(JavaConfig.class);
		Student bean = apc.getBean("getStudent", Student.class);
		System.out.println(apc.isSingleton("getStudent"));
		System.out.println(apc.isPrototype("getStudent"));
		bean.display();
		
		Employee bean2 = apc.getBean("getEmployee",Employee.class);
		bean2.show();
		
		Person bean3 = apc.getBean("getDis",Person.class);
		bean3.getDis();
	    System.out.println(apc.isSingleton("getperson"));
	    System.out.println(apc.isPrototype("getperson"));
		

	}

}
