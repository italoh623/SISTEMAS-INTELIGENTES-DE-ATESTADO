package ufpe.cin.gerenciamento.atestados.comunicação;

import ufpe.cin.gerenciamento.atestados.model.GeradorSenha;
import ufpe.cin.gerenciamento.atestados.model.IGeradorSenha;

import java.util.Collections;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gerarSenha")
public class GeradorSenhaController {

    private IGeradorSenha geradorSenha = new GeradorSenha();

    @GetMapping()
    public Map<String, String> gerarSenha(Model model) {
        try {
            return Collections.singletonMap("senha", geradorSenha.gerarSenha());
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.singletonMap("senha", "");
        }
    }
}