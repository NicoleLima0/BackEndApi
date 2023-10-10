package senac.java.Controllers;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import senac.java.Services.ResponseEndpoints;

import java.io.IOException;

public class UserController {
    static ResponseEndpoints res = new ResponseEndpoints();

    public static class UserHandler implements HttpHandler { // criando uma classe para modificar uma outra classe
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String response = "";

            if ("GET".equals(exchange.getRequestMethod())) {
                response = "Essa é a rota de usuário - GET";
                res.enviarResponse(exchange, response);
            } else if ("POST".equals(exchange.getRequestMethod())) {
                response = "Essa é a rota de usuário - POST";
                res.enviarResponse(exchange, response);
            } else if ("PUT".equals(exchange.getRequestMethod())) {
                response = "Essa é a rota de usuário - PUT";
                res.enviarResponse(exchange, response);
            } else if ("DELETE".equals(exchange.getRequestMethod())) {
                response = "Essa é a rota de usuário - DELETE";
                res.enviarResponse(exchange, response);
            } else {
                response = "Rota usuário - Método não disponivel."  + " O método utilizado foi: " + exchange.getRequestMethod();
                res.enviarResponse(exchange, response);
            }
        }
    }

}
