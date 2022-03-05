package org.twodimarray;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		
	
 //Syntax
	int a[][] = new int[2][3];
	a[0][0]=1;
	a[0][1]=2;
	a[0][2]=3;
	a[1][0]=4;
	a[1][1]=5;
	a[1][2]=6;
	System.out.println("find the particular array value");
	System.out.println(a[1][2]);
	
	System.out.println("find the size of the array");
	int length = a.length;
   System.out.println(length);
  
  
  System.out.println("for loop");
  
  for (int i = 0; i < 2; i++) {
	for (int j = 0; j < 3; j++) {
		System.out.println(a[i][j]);
	}
}
	System.out.println("enhanced for loop");
  
	for (int[] x : a) {
		for (int y : x) {
			System.out.println(y);
		}
		
	}
	
	
}
}
