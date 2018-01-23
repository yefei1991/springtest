package sprintBeanTest2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class SpringStart {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
		String[] beans=context.getBeanDefinitionNames();
		for(String s:beans) {
			System.out.println(s);
		}
		CompactDisc cd=(CompactDisc)context.getBean("sgtPeppers");
		cd.play();
	}

}
