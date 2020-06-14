package com.wipro.languagebasics;

public class EvenFirstArray {

	public static void main(String[] args) {
		int[] a= {3,2,5,4,2};
		int[] b=new int[5];
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				b[j++]=a[i];
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
				b[j++]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}

	}

}
