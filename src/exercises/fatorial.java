package exercises;

import java.util.Scanner;

public class fatorial {
public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite um numero:");
		int num = sc.nextInt();
		
		int fatorial = 1;
        
        for (int index = num; index > 0; index--) {
            fatorial *= index;
            System.out.println("index " + index);
            System.out.println("fatorial " + fatorial);
        }
        
        System.out.println("fatorial de " + num + " é " + fatorial);
	}
}