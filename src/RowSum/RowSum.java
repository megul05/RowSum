package RowSum;

import java.util.Arrays;
import java.util.Scanner;

public class RowSum {
	public static void sumrow(int[][] mat,int rows,int cols)
	{
		int sum[] =new int[rows];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				sum[i] += mat[i][j];
			}
		}
		System.out.println(Arrays.toString(sum));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		int cols = scan.nextInt();
		int[][] mat = new int[rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				 mat[i][j] = scan.nextInt();
			}
		}
		sumrow(mat,rows,cols);

	}

}
