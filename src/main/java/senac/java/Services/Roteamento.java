package senac.java.Services;

import senac.java.Domain.Horarios;
import senac.java.Views.SobreVenda;
import senac.java.Views.TelaInicial;

public class Roteamento {

    public static void rotas(int escolha) {
        Cadastro cadastro = new Cadastro();

        switch (escolha) {
            case 1:
                Cadastro.Funcionario();
                break;

            case 2:
                Cadastro.Cliente();
                break;

            case 3:
                Horarios.obterHorariosDoFuncionario();
                break;

            case 4:
                Horarios.exibirHorarios();
                break;

            case 5:
                SobreVenda.informacoesVenda();
                break;

            case 6:
                break;
        }

    }

    public static void finalizarOuContinuar(String Cp, int myTela) {
        if (Cp.equals("sim")) {
            switch (myTela) {
                case 1:
                    Cadastro.Funcionario();
                    break;
                case 2:
                    Cadastro.Cliente();
                    break;
                default:
                    System.out.println("cheguei aqui");
            }
        } else if (Cp.equals("não")) {
            TelaInicial.telaDeOpcoes();
        }
    }
}
