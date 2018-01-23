package springBeanTest1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringStart {

	public static void main(String[] args) {
		 ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);
		 String[] beans=context.getBeanDefinitionNames();
		 for(String s:beans) {
			 System.out.println(s);
		 }
		 Person yefei=(Person)context.getBean("yefei");
		 yefei.sayHello();
		// System.out.println(yefei.getSex());
	}

}
