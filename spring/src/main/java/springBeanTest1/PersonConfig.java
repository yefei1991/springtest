package springBeanTest1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig {

	@Bean
	public Person yefei() {
		return new Person("yefei","male");
	}
	
	@Bean 
	public Person liuxuan() {
		return new Person("liuxuan","female");
	}
	
	@Bean
	public PersonAop aop() {
		return new PersonAop();
	}
	
}
