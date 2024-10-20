/*
NOME COMPLETO: Naiara Carmo do Bonfim Maciel
DISCIPLINA: Desenvolvimento de aplicações
TURMA: TCTG241CNTDEV
*/


import java.util.Scanner;

public class Palavra01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        
        int comprimento = palavra.length();
        char primeiraLetra = palavra.charAt(0);
        char letraCentral = palavra.charAt(comprimento / 2);
        char ultimaLetra = palavra.charAt(comprimento - 1);
        String palavraInvertida = new StringBuilder(palavra).reverse().toString();

        System.out.println("A palavra digitada foi: " + palavra);
        System.out.println("A palavra tem " + comprimento + " dígitos");
        System.out.println("A primeira letra é " + primeiraLetra);
        System.out.println("A letra central da palavra é " + letraCentral);
        System.out.println("A última letra é " + ultimaLetra);
        System.out.println("A palavra escrita ao contrário é: " + palavraInvertida);
        System.out.println("A palavra toda em maiúsculo: " + palavra.toUpperCase());
        System.out.println("A palavra toda em minúsculo: " + palavra.toLowerCase());
    }
}