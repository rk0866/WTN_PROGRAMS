package com.wipro.languagebasics;

public class Array1 {

	public static void main(String[] args) {
		int[] a= {1,5,8,6,5,8};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum+" "+sum/a.length);

	}

}
