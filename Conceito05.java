/*
NOME COMPLETO: Naiara Carmo do Bonfim Maciel
DISCIPLINA: Desenvolvimento de aplicações
TURMA: TCTG241CNTDEV
*/



import java.util.Scanner;

public class Conceito05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Solicita que o usuário informe uma nota
        System.out.println("Digite a nota (de 0 a 100): ");
        int nota = scanner.nextInt();
        
        //Condicional que avalia o conceito apartir da nota informada
        char conceito;
        if (nota > 90) {
            conceito = 'A';
        } else if (nota > 80) {
            conceito = 'B';
        } else if (nota > 70) {
            conceito = 'C';
        } else if (nota > 60) {
            conceito = 'D';
        } else {
            conceito = 'E';
        }
        
        System.out.println("De acordo com a nota informada, o conceito é: " + conceito);
    }
}