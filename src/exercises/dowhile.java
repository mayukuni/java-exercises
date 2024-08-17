package exercises;

import java.util.Scanner;

public class dowhile {
public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		int senha = 1234;
		
		do {
			System.out.println("digite");
			num =sc.nextInt();
		} while ( senha != num);		
		System.out.println("ihaaaaa");
	}
}
