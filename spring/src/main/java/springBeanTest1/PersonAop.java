package springBeanTest1;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PersonAop {

	public PersonAop() {
		System.out.println("声明切点");
	}

	@Pointcut("execution(* springBeanTest1..*.*(..))")
	public void sleeppoint() {
	}

	@Before("sleeppoint()")
	public void beforeSleep() {
		System.out.println("睡觉前要脱衣服!");
	}

	@AfterReturning("sleeppoint()")
	public void afterSleep() {
		System.out.println("睡醒了要穿衣服！");
	}
	
}