package com.wipro.languagebasics;

public class SumofAllDigits {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int sum=0,i=0,j=0,k=0;
		while(a>0)
		{
			k=a%10;
			sum=sum+k;
			a=a/10;
		}
		System.out.println(sum);

	}

}
