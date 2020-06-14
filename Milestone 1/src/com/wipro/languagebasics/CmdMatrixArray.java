package com.wipro.languagebasics;

public class CmdMatrixArray {

	public static void main(String[] args) {
		int[] a=new int[9];
		int[][] mat=new int[3][3];
		int i,j,k=0;
		for(i=0;i<args.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				mat[i][j]=a[k++];
			}
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		int c=mat[0][0];
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if(mat[i][j]>c)
					c=mat[i][j];
			}
		}
		System.out.println("The max number is "+c);
	}

}
