package senac.java;

import senac.java.Services.Servidor;
import senac.java.Views.TelaInicial;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        TelaInicial tela = new TelaInicial();
        Servidor servidor = new Servidor();

        servidor.ServerSide();
        TelaInicial.telaDeOpcoes();
    }
}