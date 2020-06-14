package com.wipro.languagebasics;

public class PrimeInBetween {

	public static void main(String[] args) {
		int t=10,cnt=0;
		while(t>=10&&t<=99)
		{
			cnt=0;
		for(int i=2;i<=t/2;i++)
		{
			if(t%i==0)
				cnt++;
			
		}
		
		if(cnt==0) {
		System.out.print(t+" ");
		t++;
		}
		else
			t++;
		}
	}

}
