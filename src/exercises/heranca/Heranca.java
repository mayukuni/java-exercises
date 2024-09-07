package exercises.heranca;

//Classe base Funcionario
public abstract class Funcionario {
 protected String nome;
 protected double salarioBase;

 public Funcionario(String nome, double salarioBase) {
     this.nome = nome;
     this.salarioBase = salarioBase;
 }

 // Método abstrato para calcular bonificação
 public abstract double calcularBonificacao();

 // Método para calcular o imposto (pode ser sobrescrito nas subclasses se necessário)
 public double calcularImposto() {
     return salarioBase * 0.1; // Supondo imposto de 10% por padrão
 }

 // Método para imprimir os detalhes do funcionário
 public void imprimirDetalhes() {
     System.out.println("Nome: " + nome);
     System.out.println("Salário Base: R$ " + salarioBase);
     System.out.println("Bonificação: R$ " + calcularBonificacao());
     System.out.println("Imposto: R$ " + calcularImposto());
     System.out.println("Salário Total: R$ " + (salarioBase + calcularBonificacao() - calcularImposto()));
     System.out.println();
 }
}

//Classe Gerente que herda de Funcionario
class Gerente extends Funcionario {
 public Gerente(String nome, double salarioBase) {
     super(nome, salarioBase);
 }

 @Override
 public double calcularBonificacao() {
     return salarioBase * 0.15; // Bonificação de 15% para Gerente
 }
}

//Classe Diretor que herda de Funcionario
class Diretor extends Funcionario {
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
}

//Classe Principal para execução
public class Heranca {
 public static void main(String[] args) {
     Funcionario funcionario = new Funcionario("João", 3000) {
         @Override
         public double calcularBonificacao() {
             return salarioBase * 0.10; // Bonificação de 10% para Funcionario
         }
     };

     Gerente gerente = new Gerente("Maria", 5000);
     Diretor diretor = new Diretor("Pedro", 7000);

     funcionario.imprimirDetalhes();
     gerente.imprimirDetalhes();
     diretor.imprimirDetalhes();
 }
}
