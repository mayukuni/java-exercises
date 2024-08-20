package exercises;

import java.util.Scanner;

public class contador {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite primeiro numero:");
		int num = sc.nextInt();
		System.out.println("digite segundo numero:");
		int cont = sc.nextInt();
		
		for (int index = num; index <= cont; index += 1) {
			System.out.println(num);
			num = num + 1;
		}
	}
}
