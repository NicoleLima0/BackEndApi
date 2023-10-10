package senac.java.Services;

import senac.java.Domain.Funcionario;
import senac.java.Domain.Horarios;
import senac.java.Domain.Users;

import java.util.Scanner;

public class Cadastro {
    static Scanner sc = new Scanner(System.in);
    static Users cliente = new Users();
    static Funcionario func = new Funcionario();

    public static void Cliente() {

        System.out.println("Cadastro de cliente: ");

        System.out.println("Por favor digite o nome completo do cliente:");
        cliente.nome = sc.nextLine();

        System.out.println("Por favor digite sobrenome do cliente:");
        cliente.sobrenome = sc.nextLine();

        System.out.println("Por favor informe o CPF:");
        cliente.cpf = sc.nextLine();

        System.out.println("Por favor informe o e-mail:");
        cliente.email = sc.nextLine();

        System.out.println("Por favor informe o endereço:");
        cliente.endereco = sc.nextLine();

        System.out.println("Por favor informe a senha que deseja utilizar:");
        cliente.senha = sc.nextLine();

        System.out.println("Cadastro do cliente realizado com sucesso!");
        System.out.println("Nome do cliente: " + cliente.nome);
        System.out.println("Cpf do cliente: " + cliente.cpf);
        System.out.println("Email do cliente: " + cliente.email);
        System.out.println("Endereço do cliente: " + cliente.endereco);
        System.out.println("Senha do cliente: " + cliente.senha);

    }
    public static void Funcionario() {

        System.out.println("Cadastro de funcionário: ");

        System.out.println("Por favor digite o nome completo do funcionário:");
        func.completeName = sc.nextLine();

        System.out.println("Por favor informe o CPF:");
        func.cpf = sc.nextLine();

        System.out.println("Por favor informe o e-mail:");
        func.email = sc.nextLine();

        System.out.println("Por favor informe o endereço:");
        func.address = sc.nextLine();

        System.out.println("Por favor informe a senha que deseja utilizar:");
        func.password = sc.nextLine();

        System.out.println("Cadastro do funcionário realizado com sucesso!");
        System.out.println("Nome do funcionário: " + func.completeName);
        System.out.println("Cpf do funcionário: " + func.cpf);
        System.out.println("Email do funcionário: " + func.email);
        System.out.println("Endereço do funcionário: " + func.address);
        System.out.println("Senha do funcionário: " + func.password);
    }
}

