package exercises;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
//		le o primeiro numero
		System.out.println("digite o primeiro numero:");		
		int a = ler.nextInt();
//		le o segundo numero
		System.out.println("digite o seugndo numero:");		
		int b = ler.nextInt();
		
		if (a > 0) {			
			System.out.println("div:" + (a / b));
		} 
		
		else if(a < 0){
			System.out.println("negativo");
		}
		
		else {
			System.out.println("nulo");
		}
		
		System.out.println("adição:" + (a + b));
		System.out.println("sub:" + (a - b));
		System.out.println("multi:" + (a * b));
		if (b != 0) {			
			System.out.println("div:" + (a / b));
		} 
		
		else {
			System.out.println("divisao por zero não é possivel");
		}
		
	}
}
