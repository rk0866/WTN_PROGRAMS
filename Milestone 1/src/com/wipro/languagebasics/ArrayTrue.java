package com.wipro.languagebasics;

public class ArrayTrue {

	public static void main(String[] args) {
		int[] a= {1,4,1,2,1,4};
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==1||a[i]==4)
				cnt++;
		}
		if(cnt==a.length)
			System.out.println("True");
		else
			System.out.println("False");
			

	}

}
