/*
NOME COMPLETO: Naiara Carmo do Bonfim Maciel
DISCIPLINA: Desenvolvimento de aplicações
TURMA: TCTG241CNTDEV
*/


import java.util.Scanner;

public class SerieFibonacci09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de elementos da série Fibonacci: ");
        int n = scanner.nextInt();

        long[] fibonacci = new long[n];
        
        if (n > 0) {
            fibonacci[0] = 0;
        }
        if (n > 1) {
            fibonacci[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        
        System.out.println("A série Fibonacci com " + n + " elementos é:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}