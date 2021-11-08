package ufpe.cin.gerenciamento.atestados.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ufpe.cin.gerenciamento.atestados.controladores.Fachada;
import ufpe.cin.gerenciamento.atestados.entidades.Conta;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class ContaController {

    @Autowired
    Fachada fachada;
    private static final AtomicLong idCounter = new AtomicLong();

    @GetMapping(path = "/login")
    public String registrarConta(Model model) {
        return "login";
    }

    @GetMapping(path = "/conta/recuperarSenha")
    public String recuperarSenha(Model model, @RequestParam(name = "login") String login) {
        String senha = fachada.recuperarSenha(login);
        model.addAttribute("senhaRecuperada", senha);
        return "login";
    }

    @GetMapping("/conta/senha")
    public String gerarSenha(Model model) {
        String senha = fachada.gerarSenha();
        model.addAttribute("senhaGerada", senha);
        return "login";
    }

    @GetMapping("/conta/inserir")
    public String novaConta(@RequestParam(name = "login") String login, @RequestParam(name = "senha") String senha) {
        Conta conta = new Conta(login, senha);
        fachada.addConta(conta);
        return "redirect:/login";
    }

    @GetMapping("/conta/efetuarLogin")
    public String login(RedirectAttributes redirAttrs, @RequestParam(name = "login") String login, @RequestParam(name = "senha") String senha) {
        Conta conta = new Conta(login, senha);
        try {
            fachada.efetuarLogin(conta);
            redirAttrs.addFlashAttribute("error", "The error XYZ occurred.");
            return "redirect:/funcionario";
        } catch(Exception e) {
            return "redirect:/login";
        }
    }
}
