package com.wipro.languagebasics;

public class ReverseNumber {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int k=0,rem=0;
		while(a>0)
		{
			k=a%10;
			rem=rem*10+k;
			a=a/10;
		}
		System.out.println(rem);
	}

}
