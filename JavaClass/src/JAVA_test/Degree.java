package JAVA_test;
/*Create a class 'Degree' having a function 'getDegree' that prints "I got a degree". It has two 
subclasses namely 'Undergraduate' and 'Postgraduate' each having a function with the same name 
that prints "I am an Undergraduate" and "I am a Postgraduate" respectively. Call the function by 
creating an object of each of the three classes.*/
public class Degree {

	public class Undergraduate extends Degree {
		public void getDegree()
		{
			System.out.println("I am Undergraduate");
		}
	}
	public class Postgraduate extends Degree {
		public void getDegree()
		{
			System.out.println("I am Postgraduate");
		}

	}
	public void getDegree ()
	{
		System.out.println("I got a degree");
	}
}
