package com.wipro.languagebasics;

public class SearchArray {

	public static void main(String[] args) {
		int[] a= {8,5,7,3,55,10,86};
		int s=10,i;
		for(i=0;i<a.length;i++)
		{
			if(a[i]==s) {
				System.out.println(i);
				break;
			}
		}
		if(i==a.length)
			System.out.println("-1");

	}

}
