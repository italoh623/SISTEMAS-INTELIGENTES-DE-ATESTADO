package ufpe.cin.gerenciamento.atestados.model;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.reactive.function.client.WebClient;

public class GerarSenhaService implements IGerarSenhaService {

    @Value("${url_servico_gerar_senha}")
    private String urlServicoGerarSenha;

    private WebClient client() {
        System.out.println(urlServicoGerarSenha);
        return WebClient.builder().baseUrl("http://localhost:8083/gerarSenha").build();
    }

    @Override
    public String gerarSenha() {
        String responseJson = (String) client().get()
                .uri("/")
                .retrieve()
                .bodyToMono(Map.class)
                .block()
                .get("senha");

        System.out.println(responseJson);

        return responseJson;
    }

}
