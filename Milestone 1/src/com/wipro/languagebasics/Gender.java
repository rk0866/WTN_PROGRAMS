package com.wipro.languagebasics;

public class Gender {

	public static void main(String[] args) {
		String gender=args[0];
		int a=Integer.parseInt(args[1]);
		if(gender.equals("male"))
		{
			if(a>=1&&a<=58)
				System.out.println("8.4%");
			if(a>=59&&a<=100)
				System.out.println("10.5%");
		}
		else if(gender.equals("female"))
		{
			if(a>=1&&a<=58)
				System.out.println("8.2%");
			if(a>=59&&a<=100)
				System.out.println("9.2%");
		}
	}

}
