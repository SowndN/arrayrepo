package org.threedimarray;

public class ThreeDimensionalArray {

	public static void main(String[] args) {
	
	int a[][][]=new int[1][2][3];
	a[0][0][0]=100;
	a[0][0][1]=200;
	a[0][0][2]=300;
	a[0][1][0]=400;
	a[0][1][1]=500;
	a[0][1][2]=600;
	
	System.out.println("find the particular value of an array");
	System.out.println(a[0][1][2]);
	
	System.out.println("find the size of an array");
	int b = a.length;
	System.out.println(b);
	
	System.out.println("for loop");
	for (int i = 0; i < 1; i++) {
		 for (int j = 0; j < 2; j++) {
			 for (int k = 0; k < 3; k++) {
				 
				 System.out.println(a[i][j][k]);
				}
			}
		}
	 
	 System.out.println("Enhanaced for loop");
	 for (int[][] x : a) {
		 for (int[] y : x) {
			 for (int z : y) {
				 
				 System.out.println(z);
				}
			}
	  }
  }
}
