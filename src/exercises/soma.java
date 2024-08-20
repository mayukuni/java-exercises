package exercises;

import java.util.Scanner;

public class soma {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite primeiro numero:");
		int num = sc.nextInt();
		System.out.println("digite segundo numero:");
		int cont = sc.nextInt();
		
		int soma = 0;
		
		for (int index = num; index <= cont; index += 1) {
			soma = soma + num;
			System.out.println(soma);
			num += 1;
		}
	}
}
