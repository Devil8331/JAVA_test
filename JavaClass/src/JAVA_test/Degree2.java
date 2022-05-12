package JAVA_test;

import JAVA_test.Degree.Postgraduate;
import JAVA_test.Degree.Undergraduate;

public class Degree2{
public static void main(String[] args) {
	Degree Degree=new Degree();
	Degree.getDegree();
	//Outer_Demo.Inner_Demo inner = outer.new Inner_Demo();

    Degree.Undergraduate 	Undergraduate=Degree.new Undergraduate();
	Undergraduate.getDegree();

	Degree.Postgraduate Postgraduate=Degree.new Postgraduate();
	Postgraduate.getDegree();
}


	}



