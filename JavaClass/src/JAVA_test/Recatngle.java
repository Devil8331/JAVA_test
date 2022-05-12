package JAVA_test;

public class Recatngle {

	 private int length;

	 private int width;

	 Recatngle(){

	   this.length=0; // assuming default length=0

	   this.width=0; // assuming default width=0

	 }

	 Recatngle(int length, int width){

	   this.length=length;

	   this.width=width;

	 }
	 Recatngle(int length){

	   this.length=length;

	   this.width=length;

	 }

	int area(){

	  return length*width;

	}

	}
