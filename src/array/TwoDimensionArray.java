package array;

import java.util.Scanner;

public class TwoDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter no of rows : ");
		int row = sc.nextInt();
		System.out.println("enter no of Columns : ");
		int col = sc.nextInt();
		
		int[][] rollNo = new int[row][col];
		
		for(int i = 0; i < rollNo.length; i++) {
			for(int j = 0; j < rollNo[i].length; j++) {
				System.out.println("enter value of " + i + " " + j);
				rollNo[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < rollNo.length; i++) {
			for(int j = 0; j < rollNo[i].length; j++) {
				System.out.print(rollNo[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
