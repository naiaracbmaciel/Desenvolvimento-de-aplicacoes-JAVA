/*
NOME COMPLETO: Naiara Carmo do Bonfim Maciel
DISCIPLINA: Desenvolvimento de aplicações
TURMA: TCTG241CNTDEV
*/


import java.util.Scanner;

public class Regra07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true; //Inicia a variável boleana continuar como verdadeira

        //estrutura de repetição que solicita ao usuário que informe 3 valores
        while (continuar) {
            System.out.println("Digite o valor de A: ");
            double a = scanner.nextDouble();
            System.out.println("Digite o valor de B: ");
            double b = scanner.nextDouble();
            System.out.println("Digite o valor de C: ");
            double c = scanner.nextDouble();


            //calcula o resultado da regra de 3 dos números informados
            double resultado = (b * c) / a;
            System.out.println("O resultado da regra de três é: " + resultado);

            //Solicita que o usuário informe se quer sair do programa digitando SAIR
            //ou clique em qualquer outro lugar para continuar
            System.out.println("Digite 'SAIR' para encerrar ou qualquer outra tecla para continuar:");
            String comando = scanner.next();
            if (comando.equalsIgnoreCase("SAIR")) {
                continuar = false;
            }
        }
        System.out.println("Programa encerrado.");
    }
}