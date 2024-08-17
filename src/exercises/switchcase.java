package exercises;

import java.util.Scanner;

public class switchcase {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite:");
		
		int num = sc.nextInt();
		
		switch (num) {
		
		case 0, 1, 2:
			System.out.println("vc digitou" + num);
			break;
			
		case 3, 4, 5:
			System.out.println("vc digitou" + num);
			break;
			
		case 6, 7, 8:
			System.out.println("vc digitou" + num);
			break;
			
		case 9:
			System.out.println("vc digitou" + num);
			break;
			
		default:
			System.out.println("errouuu");			
		}
	}
}