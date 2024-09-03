package exercises;

import java.util.Scanner;

public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private static final String SENHA_CORRETA = "1234"; // Senha fixa para autenticação

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método para imprimir os dados
    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    // Método para autenticação
    public static boolean autenticar(String senha) {
        return SENHA_CORRETA.equals(senha);
    }

    // Método principal para execução
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos dados
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        // Criando objeto da classe Pessoa
        Pessoa pessoa = new Pessoa(nome, idade);

        // Leitura e autenticação da senha
        System.out.print("Digite a senha para acessar os dados: ");
        String senha = scanner.nextLine();

        if (autenticar(senha)) {
            // Imprimindo os dados após autenticação
            pessoa.imprimirDados();
        } else {
            System.out.println("Senha incorreta! Acesso negado.");
        }

        scanner.close();
    }
}
