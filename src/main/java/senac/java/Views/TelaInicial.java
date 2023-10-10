package senac.java.Views;

import java.util.Scanner;

import senac.java.Services.Roteamento;

public class TelaInicial {
    static Scanner sc = new Scanner(System.in);
    static String Cp = "";
    static int tela = 0;

    public static void telaInicial() {
        System.out.println("Bem-vindo ao nosso sistema: ");
        System.out.println();
        telaDeOpcoes();
    }

    public static void telaDeOpcoes() {
        Scanner sc = new Scanner(System.in);

        int escolha;

        Roteamento rotas = new Roteamento();

        System.out.println("Escolha uma opção: ");
        System.out.println("1. Cadastrar Funcionário: ");
        System.out.println("2. Cadastrar Cliente: ");
        System.out.println("3. Marcar horário do funcionário: ");
        System.out.println("4. Verificar horário do funcionário: ");
        System.out.println("5. Informações da venda: ");
        System.out.println("6. Sair ");

        escolha = sc.nextInt();

        rotas.rotas(escolha);
        telaSairOuNao(escolha);
    }

    public static void telaSairOuNao(int tela) {
        System.out.println("");
        System.out.println("Deseja fazer um novo cadastro?");
        System.out.println("");
        System.out.println("Digite sim para voltar para fazer um novo cadastro");
        System.out.println("");
        System.out.println("Digite não para voltar ao inicio");
        System.out.println("");
        System.out.println("");
        Cp = sc.nextLine();

        Roteamento.finalizarOuContinuar(Cp, tela);
    }
}

