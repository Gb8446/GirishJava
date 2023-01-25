package demogirish;

import java.io.Serializable;

public class Person implements Serializable {

	String name;
	String Mobileno;
	int age;
	
	
	
	public Person() {
		
	}
	public Person(String name, String mobileno, int age) {
		super();
		this.name = name;
		Mobileno = mobileno;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileno() {
		return Mobileno;
	}
	public void setMobileno(String mobileno) {
		Mobileno = mobileno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
