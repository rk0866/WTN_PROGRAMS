package com.wipro.languagebasics;

public class ToLowerandUpper {

	public static void main(String[] args) {
		String str="A";
		if(str.toUpperCase()==str) {
			str.toLowerCase();
		}
		else
			str.toUpperCase();
		System.out.println(str);
	}

}
