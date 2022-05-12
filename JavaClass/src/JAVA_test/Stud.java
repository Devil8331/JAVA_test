package JAVA_test;

public class Stud {
	
	String name;

	int age;

	String address;

	public Stud()

	{

	this.name="unknown";

	this.age=0;

	this.address="not avaliable";

	}

	public void setinfo(int age,String name)

	{

	this.name=name;

	this.age=age;

	}

	public void setinfo(int age ,String name,String address)

	{

	this.name=name;

	this.age=age;

	this.address=address;

}
	public String toString()

	{

	return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";

	}
}