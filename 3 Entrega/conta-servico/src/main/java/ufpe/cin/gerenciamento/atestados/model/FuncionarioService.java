package ufpe.cin.gerenciamento.atestados.model;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Component
public class FuncionarioService implements IFuncionarioService {
    @Value("${url_servico_funcionario}")
    private String urlServicoFuncionario;

    private WebClient client() {
        return WebClient.builder().baseUrl("http://localhost:8082/funcionario").build();
    }

    @Override
    public Integer addFuncionario(String nome, String cargo) {
        Map<String, String> body = new HashMap<>();

        body.put("nome", nome);
        body.put("cargo", cargo);
        
        Integer responseJson = (Integer) client().post()
                .uri("")
                .contentType(MediaType.APPLICATION_JSON)
                .body(Mono.just(body), Map.class)
                .retrieve()
                .bodyToMono(Map.class)
                .block()
                .get("id");

        System.out.println(responseJson.toString());

        return responseJson;
    }
}
