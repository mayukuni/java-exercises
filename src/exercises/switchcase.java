package exercises;

import java.util.Scanner;

public class switchcase {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite:");
		
		int num = sc.nextInt();
		
		switch (num) {
		
		case 1:
			System.out.println("1");
			break;
			
		case 2:
			System.out.println("2");
			break;
			
		case 3:
			System.out.println("3");
			break;
			
		default:
			System.out.println("errouuu");
			
		}
	}
}