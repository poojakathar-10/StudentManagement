package in.Annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope (value="Singleton")
public class Person {

	public Person() {
		super();
		System.out.println("THis is person constructor");
	}
	public Person getDis() {
		System.out.println("this is person method");
		Person p1 =new Person();
		return p1;
	}
	

}
