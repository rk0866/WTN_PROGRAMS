package com.wipro.languagebasics;

public class MiddleArray {

	public static void main(String[] args) {
		int[] a= {2,3,5};
		int[] b= {3,5,7};
		int[] c=new int[2];
		c[0]=a[a.length/2];
		c[1]=b[b.length/2];
		for(int i=0;i<c.length;i++)
			System.out.println(c[i]);

	}

}
