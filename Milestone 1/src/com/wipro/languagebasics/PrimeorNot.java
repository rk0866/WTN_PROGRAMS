package com.wipro.languagebasics;

public class PrimeorNot {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int cnt=0;
		for(int i=2;i<a/2;i++)
		{
			if(a%i==0)
				cnt++;
		}
		if(cnt==0)
			System.out.println("Prime Number");
		else
			System.out.println("Not Prime Number");

	}

}
