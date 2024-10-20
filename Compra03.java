/*
NOME COMPLETO: Naiara Carmo do Bonfim Maciel
DISCIPLINA: Desenvolvimento de aplicações
TURMA: TCTG241CNTDEV
*/


import java.util.Scanner;

public class Compra03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Solicita que o usuário informe um compra
        System.out.println("Digite o valor cheio da compra: ");
        double valorCheio = scanner.nextDouble();
        
        //Solicita que o usuário informe o valor do desconto
        System.out.println("Digite o valor do desconto: ");
        double valorDesconto = scanner.nextDouble();
        
        //Calcula o valor total após o desconto ser aplicado
        double valorNovo = valorCheio - valorDesconto;
        
        System.out.println("O valor cheio é: " + valorCheio);
        System.out.println("O valor do desconto é: " + valorDesconto);
        System.out.println("O novo valor é: " + valorNovo);
    }
}