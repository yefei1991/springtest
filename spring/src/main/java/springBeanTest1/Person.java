package springBeanTest1;

public class Person {

	private String name;
	
	private String sex;
	
	public void sayHello() {
		System.out.println("你好,我是"+this.getName());
	}

	public Person() {}
	
	public Person(String name,String sex) {
		this.name=name;
		this.sex=sex;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
