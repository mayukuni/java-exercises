package exercises;

import java.util.Scanner;

public class fat {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite");
		int num = sc.nextInt();
		
		for (long n = 1, fat = 1; n <= num; n +=1 ) {
			fat = fat * n;
			System.out.println(n + "oi"+ fat);
		}
	}
}
