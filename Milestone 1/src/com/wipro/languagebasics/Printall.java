package com.wipro.languagebasics;

public class Printall {

	public static void main(String[] args) {
		char a='1';
		if(a>='a'&&a<='z')
			System.out.println("Alphabet");
		else if(a>='0'&&a<='9')
			System.out.println("Number");
		else
			System.out.println("Special char");

	}

}
