package com.wipro.languagebasics;

public class NumberValidate {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		if(a<0)
			System.out.println("Negative");
		else if(a>0)
			System.out.println("Positive");
		else
			System.out.println("Zero");

	}
}
