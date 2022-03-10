package org.singlearray;

public class SingleArray {
public static void main(String[] args) {
	int a[] = new int[3];
	a[0]=9;
	a[1]=12;
	a[2]=14;
	System.out.println("hi java");
	// find a particular array value
	
	
	System.out.println("for GIT");
	
	System.out.println("find a particular array value");
	System.out.println(a[1]);
	
	//find the size of an array
	
	System.out.println("find the size of an array");
	int l = a.length;
	System.out.println(l);
	
	//Here using for 
	
	System.out.println("for loop");
	
	for (int i = 0; i < 3; i++) {
		System.out.println(a[i]);
	}
	
	// here using for each/enhanced for loop
	System.out.println("Enhanced for loop");
	
	for (int i : a) {
		System.out.println(i);
		
	}
}
}
