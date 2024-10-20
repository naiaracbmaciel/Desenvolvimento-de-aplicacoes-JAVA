/*
NOME COMPLETO: Naiara Carmo do Bonfim Maciel
DISCIPLINA: Desenvolvimento de aplicações
TURMA: TCTG241CNTDEV
*/


import java.util.Scanner;

public class Notas04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5]; //Inicia a variável double para 5 notas
        double soma = 0; //inicia a variável soma com valor 0
        

        //Exibe a mensagem pedindo que o usuário informe a nota de cada aluno
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota do aluno " + (i+1) + " (de 0 a 10): ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }
        
        //Cria novas variáveis para armazenar a maior e a menor nota
        double maiorNota = notas[0];
        double menorNota = notas[0];
        
        for (double nota : notas) {
            if (nota > maiorNota) maiorNota = nota;
            if (nota < menorNota) menorNota = nota;
        }
        
        //calcula a média das notas
        double media = soma / notas.length;
        
        System.out.println("A maior nota é: " + maiorNota);
        System.out.println("A menor nota é: " + menorNota);
        System.out.println("A média da turma é: " + media);
    }
}