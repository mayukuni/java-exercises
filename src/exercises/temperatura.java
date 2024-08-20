package exercises;

import java.util.Scanner;

public class temperatura {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
//		le a temp
		System.out.println("digite a temperatura em celsius");		
		int a = ler.nextInt();
		
		System.out.println("F" + ((a * 9/5) + 32));

		
	}
}
