package exercises;

import java.util.Scanner;

public class parimparmedia {
	public static void main(String args[]) {	

		Scanner sc = new Scanner(System.in);
		
		int[] vet1 = new int[10];
		int total = 0;
		
		for(int i  = 0; i<10; i++) {
			System.out.println("Digita:");
			vet1[i] = sc.nextInt();
			total += vet1[i];
		}
		
		for(int i  = 0; i<10; i++) {
			if (i % 2 != 0) {
				System.out.println("Os números pares são" + vet1[i]);
			}

		}
		
		for(int i  = 0; i<10; i++) {
			if (vet1[i] % 2 == 0) {
				System.out.println("Os números ímpares são" + vet1[i]);
			}

		}
		
		for(int i  = 0; i<10; i++) {
			if (vet1[i] > total/vet1.length) {
				System.out.println("Os números acima da média são" + vet1[i]);
			}

		}
	}
}