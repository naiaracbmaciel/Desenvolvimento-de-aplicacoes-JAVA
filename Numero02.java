/*
NOME COMPLETO: Naiara Carmo do Bonfim Maciel
DISCIPLINA: Desenvolvimento de aplicações
TURMA: TCTG241CNTDEV
*/


import java.util.Scanner;

public class Numero02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double numero = scanner.nextDouble();

        // Verificar par ou ímpar
        String parOuImpar = (numero % 2 == 0) ? "par" : "ímpar";

        // Verificar positivo ou negativo
        String positivoOuNegativo = (numero >= 0) ? "positivo" : "negativo";

        // Verificar se é primo
        boolean isPrimo = isPrimo((int)numero);
        String primoOuNao = isPrimo ? "sim" : "não";

        // Calcular raiz quadrada
        double raizQuadrada = Math.sqrt(numero);

        // Calcular número elevado a 3
        double elevadoAoCubo = Math.pow(numero, 3);

        System.out.println("O número é: " + parOuImpar);
        System.out.println("O número é: " + positivoOuNegativo);
        System.out.println("O número é primo: " + primoOuNao);
        System.out.println("A raiz quadrada do número: " + raizQuadrada);
        System.out.println("O número elevado a 3 é: " + elevadoAoCubo);
    }

    // Método para verificar se um número é primo
    public static boolean isPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
