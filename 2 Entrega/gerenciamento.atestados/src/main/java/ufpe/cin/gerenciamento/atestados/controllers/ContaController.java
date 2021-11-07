package ufpe.cin.gerenciamento.atestados.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ufpe.cin.gerenciamento.atestados.controladores.Fachada;
import ufpe.cin.gerenciamento.atestados.entidades.Conta;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class ContaController {

    @Autowired
    Fachada fachada;
    private static final AtomicLong idCounter = new AtomicLong();

    @GetMapping(path = "/efetuarLogin")
    public void efetuarLogin(String login, String senha) {
        return;
    }

    @GetMapping(path = "/registrarConta")
    public String registrarConta(Model model) {
        String senha = fachada.recuperarSenha("test");
        model.addAttribute("senha", senha);
        return "login";
    }

    @GetMapping("/conta/inserir/")
    public String novaConta(@RequestParam(name = "login") String login){
        Conta conta = new Conta(login, "senha123");
        fachada.addConta(conta);
        return "redirect:/registrarConta";
    }
}
