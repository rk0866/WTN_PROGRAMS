package com.wipro.languagebasics;

public class CmdLineArgs1 {
public static void main(String[] args) {
	if(args.length==0)
		System.out.println("No Values");
	else {
		for(int i=0;i<args.length;i++)
		{
			if(args[i]!=null)
				System.out.println(args[i]+" ,");
		}
	}	
}
}