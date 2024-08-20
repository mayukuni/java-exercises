package exercises;

import java.util.Scanner;

public class oii {

	public static void main(String[] args) {
		
//		cria um scanner para ler o teclado
		
		Scanner ler = new Scanner(System.in);
		
//		le o nome		
		System.out.println("digite seu nome:");		
		String nom = ler.nextLine();
		
//		le a idade
		System.out.println("digite sua idade:");		
		int id = ler.nextInt();
		
//		le a altura
		System.out.println("digite sua altura:");
		double alt = ler.nextDouble();
		
//		le o peso		
		System.out.println("digite seu peso:");		
		int peso = ler.nextInt();
		
//		le o genero		
		System.out.println("digite seu genero(M/F):");		
		String gen = ler.nextLine();
		
		System.out.println("meu nome é:" + nom);
		System.out.println("minha idade é:" + id);
		System.out.println("minha altura é:" + alt);

	}

}
