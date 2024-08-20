package exercises;

import java.util.Scanner;

public class imposto {

    public static void main(String[] args) {
        
        // Cria um Scanner para ler o teclado
        Scanner ler = new Scanner(System.in);
        
        // Lê o salário
        System.out.println("Digite o salário:");        
        double a = ler.nextDouble();
        
        // Verifica a faixa de salário e imprime a porcentagem de imposto
        if (a < 20000.00) {            
            System.out.println("Isento");
        } else if (a >= 20000.00 && a < 45000.00) {
            System.out.println("Paga 7.5%:" + ((a / 100) * 7.5));
        } else if (a >= 45000.00 && a < 65000.00) {
            System.out.println("Paga 15%:" + ((a / 100) * 15));
        } else {
            System.out.println("Paga 22.5%:" + ((a / 100) * 22.5));
        }
        
    }
}
