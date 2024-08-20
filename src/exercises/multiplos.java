package exercises;

import java.util.Scanner;

public class multiplos {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite");
		int num1 = sc.nextInt();
		System.out.println("digite");
		int num2 = sc.nextInt();
		
		for (int index = num1; index < num2; index += 1) {
			if (num1 % 3 == 0) {
				System.out.println(num1);
			}
			num1 += 1;
		}
	}
}
