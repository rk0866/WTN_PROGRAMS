package com.wipro.languagebasics;

import java.util.Arrays;

public class LargeandSmall {

	public static void main(String[] args) {
		int[] a= {12,3,5,8,99,76,45,87};
		Arrays.sort(a);
		System.out.println(a[0]+" "+a[1]+" "+a[a.length-1]+" "+a[a.length-2]);

	}

}
