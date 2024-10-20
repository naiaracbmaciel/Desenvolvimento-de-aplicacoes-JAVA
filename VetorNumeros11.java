/*
NOME COMPLETO: Naiara Carmo do Bonfim Maciel
DISCIPLINA: Desenvolvimento de aplicações
TURMA: TCTG241CNTDEV
*/


import java.util.Arrays;
import java.util.Random;

public class VetorNumeros11 {
    public static void main(String[] args) {
        Random rnd = new Random(); // Inicia aleatório
        int[] numeros = new int[10];

        // Gera 10 números aleatórios entre 0 e 9 e insere no vetor
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(10);
        }

        // Apresenta a lista com os números obtidos
        System.out.println("Lista com os números obtidos: " + Arrays.toString(numeros));

        // Ordena a lista em ordem crescente
        int[] numerosCrescente = numeros.clone();
        Arrays.sort(numerosCrescente);
        System.out.println("Lista com os números ordenados em ordem crescente: " + Arrays.toString(numerosCrescente));

        // Ordena a lista em ordem decrescente
        int[] numerosDecrescente = numeros.clone();
        Arrays.sort(numerosDecrescente);
        for (int i = 0; i < numerosDecrescente.length / 2; i++) {
            int temp = numerosDecrescente[i];
            numerosDecrescente[i] = numerosDecrescente[numerosDecrescente.length - i - 1];
            numerosDecrescente[numerosDecrescente.length - i - 1] = temp;
        }
        System.out.println("Lista com os números ordenados em ordem decrescente: " + Arrays.toString(numerosDecrescente));
    }
}