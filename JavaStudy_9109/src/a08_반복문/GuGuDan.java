package a08_반복문;

import java.util.Scanner;

public class GuGuDan {

	public static void main(String[] args) {
		//2 X 2 ~ 9 X 9
		
		/*
		 * [2단]
		 * 2 X 1 = 2
		 * 2 X 2 = 4
		 * 2 X 9 = 18
		 *
		 * [3단]
		 * 3 X 1 = 3
		 * 
		 * ...
		 * 
		 * [9단]
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("시작 단수:" );
		int startDan = input.nextInt();
		input.nextLine();
		System.out.println("마지막 단수:" );
		int endDan = input.nextInt();
		input.nextLine();
		
			
			
		for(int i = startDan; i < (endDan + 1); i++) {
			System.out.println("[" + i + "단]");
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + (i*j));	
			}
			System.out.println();
		}

	}

}
