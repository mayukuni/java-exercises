package exercises;

import java.util.Scanner;

public class parimpar {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite:");
		
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("par");
		}  else {
			System.out.println("impar");
		}
	}
}
