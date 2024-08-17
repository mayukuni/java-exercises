package exercises;

import java.util.Scanner;

public class oi {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite:");
		
		int num = sc.nextInt();
		
		if (num > 0) {
			System.out.println("positivo");
		} else if (num < 0) {
			System.out.println("negativo");
		} else {
			System.out.println("nulo");
		}
	}
}
