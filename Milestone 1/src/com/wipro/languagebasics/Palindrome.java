package com.wipro.languagebasics;

public class Palindrome {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int k=0,rem=0;
		int t=a;
		while(t>0)
		{
			k=a%10;
			rem=rem*10+k;
			t=t/10;
		}
		if(rem==a)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

}
