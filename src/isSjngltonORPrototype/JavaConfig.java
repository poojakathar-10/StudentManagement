package isSjngltonORPrototype;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan (basePackages = {"isSjngltonORPrototype","in.Annotation"})
public class JavaConfig {
	
	@Bean
	//@Scope(value="Singleton")
	public Student getStudent() {
		Student stu =new Student();
		return stu;
		
	}
	
	@Bean
	public Employee getEmployee() {
		Employee e1=new Employee();
		return e1;
	}

}
