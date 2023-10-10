package senac.java.Services;

import com.sun.net.httpserver.HttpServer;
import senac.java.Controllers.ClientController;
import senac.java.Controllers.FuncionarioController;
import senac.java.Controllers.UserController;
import senac.java.Domain.Funcionario;
import senac.java.Domain.Users;

import java.io.IOException;
import java.net.InetSocketAddress;


public class  Servidor {
    //     static HttpExchange ex;
    public void ServerSide() throws IOException {
        Funcionario funcionario = new Funcionario();
        Users users = new Users();

        HttpServer server = HttpServer.create(new InetSocketAddress(3000), 0);//preciso criar um servidor http

        server.createContext("/api/usuario", new UserController.UserHandler());
        server.createContext("/api/cliente", new ClientController.ClienteHandler());
        server.createContext("/api/funcionario", new FuncionarioController.FuncionarioHandler());

        server.setExecutor(null); //configurações do servidor
        server.start();
        System.out.println("Servidor Iniciado!");

    }

//    public static void chamar(HttpExchange exchange) throws IOException {
//        if ("GET".equals(exchange.getRequestMethod())) {
//            String response = "teste";
//            exchange.sendResponseHeaders(200, response.length());
//
//            OutputStream os = exchange.getResponseBody(); // criar na memória um lugar de resposta
//            os.write(response.getBytes()); // enviando a mensagem por inteira
//            os.close(); // importante sempre fechar!

}
