package exercises;

import java.util.Scanner;

public class imparpar {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int y = 0;
		System.out.println("digite:");
		do {
			if (y == 1) {
				return;
			} else if (num % 2 == 0) {
				y = num / 2;
				num = y;
			} else {
				y = 3 * num + 1;
				num = y;
			}
		System.out.print(y + " ");
		} while (y > 1);	
	}
}
