package com.wipro.languagebasics;

public class ColorCode {

	public static void main(String[] args) {
		String a=args[0];
		char c=a.charAt(0);
		switch(c)
		{
		case 'R':System.out.println("Red");
		break;
		case 'B':System.out.println("Blue");
		break;
		case 'W':System.out.println("White");
		break;
		case 'G':System.out.println("Green");
		break;
		case 'O':System.out.println("Orange");
		break;
		case 'Y':System.out.println("Yellow");
		break;
		default:System.out.println("Invalid Code");
		break;
		}

	}

}
