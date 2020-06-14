package com.wipro.languagebasics;

public class ArraySumCondition {

	public static void main(String[] args) {
		int[] a= {10,3,6,1,2,7,9};
		int i,j=0,sum=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]==6)
			{
				j=1;
				continue;
			}
			else if(j==1)
			{
				if(a[i]==7)
				{
					j=0;
					continue;
				}
				else
					continue;
			}
			else
				sum=sum+a[i];
			
		}
		System.out.println(sum);

	}

}
