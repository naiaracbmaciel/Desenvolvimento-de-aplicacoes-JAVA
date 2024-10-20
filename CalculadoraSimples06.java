/*
NOME COMPLETO: Naiara Carmo do Bonfim Maciel
DISCIPLINA: Desenvolvimento de aplicações
TURMA: TCTG241CNTDEV
*/

import java.util.Scanner;

public class CalculadoraSimples06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true; //Inicia a variável boleana continuar como verdadeira
        
        //Estrutura de repetição que apresenta um menu de opções ao usuário
        while (continuar) {
            System.out.println("Escolha uma operação: ");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");
            int escolha = scanner.nextInt();


            //Condicional que encerra o programa se o usuário escolher a opção 5
            if (escolha == 5) {
                continuar = false;
                System.out.println("Encerrando...");
                break;
            }

            //Solicita ao usuário que informe 2 números
            System.out.println("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();
            System.out.println("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            //Estrutura de decisão que executa um calculo de acordo com a opção escolhida pelo usuário
            switch (escolha) {
                case 1:
                    System.out.println("Resultado da adição: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado da subtração: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Resultado da multiplicação: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Resultado da divisão: " + (num1 / num2));
                    } else {
                        System.out.println("Erro: Divisão por zero!");
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
