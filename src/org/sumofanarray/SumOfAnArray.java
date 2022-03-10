package org.sumofanarray;

public class SumOfAnArray {
public static void main(String[] args) {
	int sum = 0;
	int z=0;
	int a[]=new int[10];
	a[0]=1;
	a[1]=2;
	a[2]=3;
	a[3]=4;
	a[4]=5;
	a[5]=6;
	a[6]=7;
	a[7]=8;
	a[8]=9;
	a[9]=10;
	for (int i : a)             // using for each loop
	{
		sum=sum+i;
		
				System.out.println(sum);
				System.out.println("vanitha");
	}
	
	int x = a.length;
	System.out.println(x);
	z=sum/x;
	System.out.println(z);
		
	}
	
}

