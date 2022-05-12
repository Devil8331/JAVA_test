package JAVA_test;

import java.util.ArrayList;
import java.util.List;

public class Stud_2{

	public static void main(String[] args)

	{

	List<Stud> stu=new ArrayList<>();
	
	stu.add(new Stud());

	stu.add(new Stud());

	stu.add(new Stud());
	
	stu.get(0).setinfo(25, "Akash","Pune,MH");
	stu.get(1).setinfo(25, "Sam","Pune,MH");
	stu.get(2).setinfo(5, "Aryan","Pune,MH");
	for(Stud s :stu)
	{
	System.out.println(s);
	}	
	}
	}


