package exercises;

import java.util.Scanner;

public class cliente {
   
    private String Nome;
    private int idade;
    private static final String SENHA = "123";
   
   
    public cliente() {
       
    }
   
   
    public cliente(String Nome, int idade) {
       
        this.Nome = Nome;
        this.idade = idade;
       
    }
   
   
   
    private boolean validaSenha() {
       
        System.out.println("Digite sua senha");
        Scanner scLC = new Scanner(System.in);
        String Msenha = scLC.nextLine();
        return Msenha.equals(SENHA);
    }
   
   
   
   
    public String getNome() {
       
        if (validaSenha()) {
           
            return Nome;
           
        }
        else {
            System.out.println("Senha incorreta");
            return null;
        }

       
   }

   public void setNome(String nome) {
       
       if (validaSenha()) {
        Nome = nome;
       }
       else {
           System.out.println("Senha errada");
       }
   }



   public int getIdade() {
       return idade;
   }


   public void setIdade(int idade) {
       this.idade = idade;
   }

   
   
   

   public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       
       cliente cl1 = new cliente();
       
       System.out.println("Digite nome");
       
       cl1.setNome(sc.nextLine()); // lendo o nome
       
System.out.println("Digite idade");
       
       cl1.setIdade(sc.nextInt()); //lendo a idade
       
       sc.nextLine();
       
       System.out.println("Nome = " + cl1.getNome());
       
       System.out.println("Idade = " + cl1.getIdade());
       
       

   }

}
