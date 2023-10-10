package senac.java.Controllers;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import senac.java.Services.ResponseEndpoints;

import java.io.IOException;

public class ClientController {
    public static class ClienteHandler implements HttpHandler {
        static ResponseEndpoints res = new ResponseEndpoints();

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String response = "";

            if ("GET".equals(exchange.getRequestMethod())) {
                response = "Essa é a rota de Cliente - GET";
                res.enviarResponse(exchange, response);
            } else if ("POST".equals(exchange.getRequestMethod())) {
                response = "Essa é a rota de Cliente - POST";
                res.enviarResponse(exchange, response);
            } else if ("PUT".equals(exchange.getRequestMethod())) {
                response = "Essa é a rota de Cliente - PUT";
                res.enviarResponse(exchange, response);
            } else if ("DELETE".equals(exchange.getRequestMethod())) {
                response = "Essa é a rota de Cliente - DELETE";
                res.enviarResponse(exchange, response);
            } else {
                response = "Rota Cliente - Método não disponivel."  + " O método utilizado foi: " + exchange.getRequestMethod();
                res.enviarResponse(exchange, response);
            }

        }
    }
}
