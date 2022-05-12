package JAVA_test;

/*1.Write a program to print the names of students by creating a Student class. 
If no name is passed while creating an object of the Student class, then the name should be "Unknown", 
otherwise the name should be equal to the String value passed while creating the object of the Student class.*/
public class Q1_Student 
{
	
		String name;
		public Q1_Student (String n)
		{
		name=n;
		}
		public Q1_Student()
		{
		name="Unknown";
		}
}

