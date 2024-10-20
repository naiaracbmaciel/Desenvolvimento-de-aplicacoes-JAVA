/*
NOME COMPLETO: Naiara Carmo do Bonfim Maciel
DISCIPLINA: Desenvolvimento de aplicações
TURMA: TCTG241CNTDEV
*/

import java.util.Scanner;

public class CadastroPessoas {

    //Inicializando variáveis
    static int[][] ids = new int[100][1];
    static String[][] nomes = new String[100][1];
    static String[][] datasNascimento = new String[100][1];
    static int quantidadePessoas = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        //Apresenta um menu de opções numa estrutura de repetição
        while (continuar) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Inserir pessoa");
            System.out.println("2 - Alterar dados da pessoa");
            System.out.println("3 - Consultar dados da pessoa");
            System.out.println("4 - Excluir dados de uma pessoa");
            System.out.println("5 - Sair");

            int opcao = scanner.nextInt(); //Variável que guarda a opção escolhida

            //inicia estrutura de controle com menu de opções
            switch (opcao) {
                case 1:
                    inserirPessoa(scanner);
                    break;
                case 2:
                    alterarDadosPessoa(scanner);
                    break;
                case 3:
                    consultarDadosPessoa(scanner);
                    break;
                case 4:
                    excluirDadosPessoa(scanner);
                    break;
                case 5:
                    continuar = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    //Inicia o método de cadastro de pessoas
    public static void inserirPessoa(Scanner scanner) {
        if (quantidadePessoas < 100) {
            System.out.println("Digite o ID da pessoa: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            System.out.println("Digite o nome da pessoa: ");
            String nome = scanner.nextLine();

            System.out.println("Digite a data de nascimento da pessoa (DD/MM/AAAA): ");
            String dataNascimento = scanner.nextLine();

            ids[quantidadePessoas][0] = id;
            nomes[quantidadePessoas][0] = nome;
            datasNascimento[quantidadePessoas][0] = dataNascimento;
            quantidadePessoas++;

            System.out.println("Pessoa inserida com sucesso!");
        } else {
            System.out.println("Cadastro cheio!");
        }
    }

    //Inicia o método de alteração de dados de pessoas
    public static void alterarDadosPessoa(Scanner scanner) {
        System.out.println("Digite o ID da pessoa a ser alterada: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        for (int i = 0; i < quantidadePessoas; i++) {
            if (ids[i][0] == id) {
                System.out.println("Digite o novo nome da pessoa: ");
                String novoNome = scanner.nextLine();

                System.out.println("Digite a nova data de nascimento da pessoa (DD/MM/AAAA): ");
                String novaDataNascimento = scanner.nextLine();

                nomes[i][0] = novoNome;
                datasNascimento[i][0] = novaDataNascimento;

                System.out.println("Dados alterados com sucesso!");
                return;
            }
        }

        System.out.println("Pessoa não encontrada!");
    }

    //Inicia o método de consulta do cadastro de pessoas
    public static void consultarDadosPessoa(Scanner scanner) {
        System.out.println("Digite o ID da pessoa a ser consultada: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        for (int i = 0; i < quantidadePessoas; i++) {
            if (ids[i][0] == id) {
                System.out.println("ID: " + ids[i][0]);
                System.out.println("Nome: " + nomes[i][0]);
                System.out.println("Data de Nascimento: " + datasNascimento[i][0]);
                return;
            }
        }

        System.out.println("Pessoa não encontrada!");
    }

    //Inicia o método de excluir o cadastro de pessoas
    public static void excluirDadosPessoa(Scanner scanner) {
        System.out.println("Digite o ID da pessoa a ser excluída: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        for (int i = 0; i < quantidadePessoas; i++) {
            if (ids[i][0] == id) {
                for (int j = i; j < quantidadePessoas - 1; j++) {
                    ids[j][0] = ids[j + 1][0];
                    nomes[j][0] = nomes[j + 1][0];
                    datasNascimento[j][0] = datasNascimento[j + 1][0];
                }
                quantidadePessoas--;
                System.out.println("Pessoa excluída com sucesso!");
                return;
            }
        }

        System.out.println("Pessoa não encontrada!");
    }
}