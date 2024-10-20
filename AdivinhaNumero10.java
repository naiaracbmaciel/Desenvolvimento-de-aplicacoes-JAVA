/*
NOME COMPLETO: Naiara Carmo do Bonfim Maciel
DISCIPLINA: Desenvolvimento de aplicações
TURMA: TCTG241CNTDEV
*/


import java.util.Random;
import java.util.Scanner;

public class AdivinhaNumero10 {
    public static void main(String[] args) {
        Random rnd = new Random(); //Inicia aleatório
        int x = rnd.nextInt(10); // Gera um número aleatório entre 0 e 9
        Scanner scanner = new Scanner(System.in);
        int palpite;
        

        // Condição que pede ao usuário para digitar um número, e até que o número digitado seja igual ao sorteado,
        //ele dá dicas sobre se o número sorteado é menor ou maior do que o digitado.

        while (true) {
            System.out.println("Digite seu palpite (entre 1 e 10): ");
            palpite = scanner.nextInt();
            
            if (palpite == x) {
                System.out.println("ACERTOU!");
                break;
            } else if (palpite < x) {
                System.out.println("MAIOR");
            } else {
                System.out.println("MENOR");
            }
        }
    }
}