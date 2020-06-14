package com.wipro.languagebasics;

public class PrimeandComposite {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		if(a==0&&a==1)
			System.out.println("It is nither prime nor composite");
		else
		{
			int cnt=0;
			for(int i=2;i<=a/2;i++)
			{
				if(a%i==0)
					cnt++;
			}
			if(cnt==0)
				System.out.println("Prime Number");
			else
				System.out.println("Not a Prime Number");
		}

	}

}
