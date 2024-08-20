package exercises;

import java.util.Scanner;

public class tabela {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		
		for(int index = 1; index <= num; index+=1) {
			System.out.println("");
			for (int j = 1; j <= index; j += 1) {
				System.out.print(index * j + " ");
			}
		}
	}
}
