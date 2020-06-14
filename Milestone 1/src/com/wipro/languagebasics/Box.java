package com.wipro.languagebasics;

public class Box {
	int w,h,d;
	Box(int width,int height,int depth)
	{
		w=width;
		h=height;
		d=depth;
	}
	int calcvolume()
	{
		return w*h*d;
	}
	public static void main(String[] args) {
		Box b=new Box(10,3,22);
		System.out.println(b.calcvolume());
	}

}
