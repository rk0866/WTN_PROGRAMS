package com.wipro.languagebasics;

public class Reverse2D {

	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		int[][] mat=new int[2][2];
		int i,j,k=0;
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				mat[i][j]=a[k++];
			}
		}
		for(i=1;i>=0;i--)
		{
			for(j=1;j>=0;j--)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}

	}

}
