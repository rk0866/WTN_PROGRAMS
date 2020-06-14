package com.wipro.languagebasics;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] a= {12,3,5,8,99,76,3,45,87,76,10,10};
		Arrays.sort(a);
		int[] b=new int[a.length];
		int i,j=0;
		for(i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
				b[j++]=a[i];
		}
		b[j++]=a[a.length-1];
		for(i=0;i<j;i++)
			System.out.println(b[i]+"  ");

	}

}
