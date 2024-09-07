package heranca;

import java.util.Scanner;

public class Heranca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de Funcionário");
        Funcionario funcionario = Funcionario.criarFuncionario(scanner);

        System.out.println("Cadastro de Gerente");
        Gerente gerente = Gerente.criarGerente(scanner);

        System.out.println("Cadastro de Diretor");
        Diretor diretor = Diretor.criarDiretor(scanner);

        System.out.println("\nDetalhes do Funcionário:");
        funcionario.imprimirDetalhes();

        System.out.println("Detalhes do Gerente:");
        gerente.imprimirDetalhes();

        System.out.println("Detalhes do Diretor:");
        diretor.imprimirDetalhes();

        scanner.close();
    }
}

package heranca;

import java.util.Scanner;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularBonificacao() {
        return salarioBase * 0.15; // Bonificação de 15% para Gerente
    }

    public static Gerente criarGerente(Scanner scanner) {
        System.out.print("Digite o nome do Gerente: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o salário base: R$ ");
        double salarioBase = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer do scanner

        return new Gerente(nome, salarioBase);
    }
}

package heranca;

import java.util.Scanner;

public class Diretor extends Funcionario {
    public Diretor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularBonificacao() {
        return salarioBase * 0.20; // Bonificação de 20% para Diretor
    }

    @Override
    public double calcularImposto() {
        return salarioBase * 0.15; // Imposto de 15% para Diretor
    }

    public static Diretor criarDiretor(Scanner scanner) {
        System.out.print("Digite o nome do Diretor: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o salário base: R$ ");
        double salarioBase = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer do scanner

        return new Diretor(nome, salarioBase);
    }
}

package heranca;

import java.util.Scanner;

public class Heranca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de Funcionário");
        Funcionario funcionario = Funcionario.criarFuncionario(scanner);

        System.out.println("Cadastro de Gerente");
        Gerente gerente = Gerente.criarGerente(scanner);

        System.out.println("Cadastro de Diretor");
        Diretor diretor = Diretor.criarDiretor(scanner);

        System.out.println("\nDetalhes do Funcionário:");
        funcionario.imprimirDetalhes();

        System.out.println("Detalhes do Gerente:");
        gerente.imprimirDetalhes();

        System.out.println("Detalhes do Diretor:");
        diretor.imprimirDetalhes();

        scanner.close();
    }
}
