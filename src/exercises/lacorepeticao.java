package exercises;

import java.util.Scanner;

public class lacorepeticao {
public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite:");
		
		int num = sc.nextInt();
		
		int index;
		int j;
		
		for (index = 0, j = 10, System.out.println("começouuuu"); index <= num; index += 1, j -= 1, System.out.println("repeteee")) {
			System.out.println("index = " + index);
			System.out.println("j = "+j);
		}
	}
}
