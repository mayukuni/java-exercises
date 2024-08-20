package exercises;

import java.util.Scanner;

public class estacao {
    public static void main(String[] args) {
        
        // Cria um Scanner para ler o teclado
        Scanner ler = new Scanner(System.in);
        
        // Lê o mês
        System.out.println("Digite o mês (1 a 12):");        
        int mes = ler.nextInt();
        
        // Determina a estação do ano com base no mês
        switch (mes) {
            case 12: 
            case 1:  
            case 2:  
                System.out.println("Verão");
                break;
            case 3:  
            case 4:  
            case 5:  
                System.out.println("Outono");
                break;
            case 6:  
            case 7:  
            case 8:  
                System.out.println("Inverno");
                break;
            case 9:  
            case 10: 
            case 11: 
                System.out.println("Primavera");
                break;
            default:
                System.out.println("Inválido");
                break;
        }
        
        // Fecha o scanner
        ler.close();
    }
}
