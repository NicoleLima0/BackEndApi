package senac.java.Domain;

import java.util.Scanner;

public class Horarios {
    public static String horarioEntrada = "";
    public static String horarioSaida = "";

//    public Horarios(String horarioEntrada, String horarioSaida) {
//        this.horarioEntrada = horarioEntrada;
//        this.horarioSaida = horarioSaida;
//    }

    public static void obterHorariosDoFuncionario() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o horário de entrada (por exemplo, 09:00): ");
        horarioEntrada = scanner.nextLine();

        System.out.print("Digite o horário de saída (por exemplo, 18:00): ");
        horarioSaida = scanner.nextLine();
    }

    public static void exibirHorarios() {
        System.out.println("Horário de Entrada: " + horarioEntrada);
        System.out.println("Horário de Saída: " + horarioSaida);
    }
}
