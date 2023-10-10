package senac.java.Controllers;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import senac.java.Services.ResponseEndpoints;
import org.json.JSONObject;

import java.io.IOException;

public class FuncionarioController {
    public static class FuncionarioHandler implements HttpHandler {
        static ResponseEndpoints res = new ResponseEndpoints();

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String response = "";

            JSONObject responseJson = new JSONObject();

            responseJson.put("MinhaChave", "Valor1");
            responseJson.put("chave2", 21975975);

            if ("GET".equals(exchange.getRequestMethod())) {
                res.enviarResponseJson(exchange, responseJson);
//                response = "Essa é a rota de Funcionário - GET";
                res.enviarResponse(exchange, response);
            } else if ("POST".equals(exchange.getRequestMethod())) {
                response = "Essa é a rota de Funcionário - POST";
                res.enviarResponse(exchange, response);
            } else if ("PUT".equals(exchange.getRequestMethod())) {
                response = "Essa é a rota de Funcionário - PUT";
                res.enviarResponse(exchange, response);
            } else if ("DELETE".equals(exchange.getRequestMethod())) {
                response = "Essa é a rota de Funcionário - DELETE";
                res.enviarResponse(exchange, response);
            } else {
                response = "Rota Funcionário - Método não disponivel." + " O método utilizado foi: " + exchange.getRequestMethod();
                res.enviarResponse(exchange, response);
            }
        }
    }
}
