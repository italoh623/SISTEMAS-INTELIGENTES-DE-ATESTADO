package ufpe.cin.gerenciamento.atestados.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ufpe.cin.gerenciamento.atestados.fachada.Fachada;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class ContaController {

    @Autowired
    Fachada fachada;
    private static final AtomicLong idCounter = new AtomicLong();

    @GetMapping(path = "/")
    public String registrarConta(Model model) {
        return "login";
    }

    @GetMapping(path = "/conta/recuperarSenha")
    public String recuperarSenha(Model model, @RequestParam(name = "login") String login) {
        String senha = fachada.recuperarSenha(login);
        model.addAttribute("senhaRecuperada", senha);
        return "login";
    }

    @GetMapping("/conta/inserir")
    public String novaConta(
            @RequestParam(name = "login") String login,
            @RequestParam(name = "senha") String senha,
            @RequestParam(name = "nome") String nome,
            @RequestParam(name = "cargo") String cargo) {
        fachada.addConta(login, senha, nome, cargo);
        return "redirect:/";
    }

    @GetMapping("/conta/efetuarLogin")
    public String login(RedirectAttributes redirAttrs, @RequestParam(name = "login") String login, @RequestParam(name = "senha") String senha) {
        try {
            Long contaId = fachada.efetuarLogin(login, senha);
            return "redirect:/funcionario/" + contaId;
        } catch(Exception e) {
            redirAttrs.addFlashAttribute("error", "Login ou senha incorretos.");
            return "redirect:/";
        }
    }
}
