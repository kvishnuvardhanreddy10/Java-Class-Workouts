package array;

import java.util.Scanner;

public class ThreeDimensionArray {
	
	
	void intThreeDimensionMethod() {
		
		int[][][] multiArray = {
				{{10,20,30},{40,50,60},{70,80,90}},
				{{1,2},{3,4},{5,6}}
				};
		
		
		for(int i = 0; i < multiArray.length; i++) {
			for(int j = 0; j < multiArray[i].length; j++) {
				for(int k = 0; k < multiArray[i][j].length; k++) {
					System.out.print(multiArray[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

	
	void stringThreeDimensionMethod() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter no of blocks : ");
		int block = sc.nextInt();
		
		System.out.println("enter no of rows : ");
		int row = sc.nextInt();
		
		System.out.println("enter no of columns : ");
		int col = sc.nextInt();
		sc.nextLine();
		
		String[][][] names = new String[block][row][col];
		
		for(int i = 0; i < names.length; i++) {
			for(int j = 0; j < names[i].length; j++) {
				for(int k = 0; k < names[i][j].length; k++) {
					System.out.println("enter u r value of " + i + " " + j + " " + k + " : " );
					names[i][j][k] = sc.nextLine();
					
				}
			}
			
		}
		
		for(int i = 0; i < names.length; i++) {
			for(int j = 0; j < names[i].length; j++) {
				for(int k = 0; k < names[i][j].length; k++) {
					System.out.print(names[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	
	void intThreeDimensionMethod2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter no of blocks : ");
		int block = sc.nextInt();
		
		int [][][] num = new int [block][][];
		
		for(int i = 0; i < num.length; i++) {
			System.out.println("enter matrix of block " + i + " of rows : " );
			int row = sc.nextInt();
			System.out.println("enter matrix of block " + i + " of columns : " );
			int col = sc.nextInt();
			num[i] = new int[row][col];
		}
		
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num[i].length; j++) {
				for(int k = 0; k < num[i][j].length; k++) {
					System.out.println("enter u r value of " + i + " " + j + " " + k + " : " );
					num[i][j][k] = sc.nextInt();
					
				}
			}
			
		}
		
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num[i].length; j++) {
				for(int k = 0; k < num[i][j].length; k++) {
					System.out.print(num[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreeDimensionArray threeDimensionArray = new ThreeDimensionArray();
		
		threeDimensionArray.intThreeDimensionMethod();
		
		System.out.println();
		
		threeDimensionArray.intThreeDimensionMethod2();
		
		System.out.println();
		
		threeDimensionArray.stringThreeDimensionMethod();
		
//		threeDimensionArray.stringThreeDimensionMethod();
//		System.out.println(multiArray[0][0][0]);
//		System.out.println(multiArray[1][2][0]);
		
		
		
	}

}
