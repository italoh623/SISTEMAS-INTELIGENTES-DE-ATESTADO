package ufpe.cin.gerenciamento.atestados.Comunicação;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ufpe.cin.gerenciamento.atestados.model.ControladorLogin;

@Controller
public class ContaController {

    @Autowired
    ControladorLogin controladorLogin;

    @GetMapping(path = "/")
    public String registrarConta(Model model) {
        return "login";
    }

    @GetMapping(path = "/conta/recuperarSenha")
    public String recuperarSenha(Model model, @RequestParam(name = "login") String login) {
        String senha = controladorLogin.recuperarSenha(login);
        model.addAttribute("senhaRecuperada", senha);
        return "login";
    }

    @GetMapping("/conta/senha")
    public String gerarSenha(Model model) {
        String senha = controladorLogin.gerarSenha();
        model.addAttribute("senhaGerada", senha);
        return "login";
    }

    @GetMapping("/conta/inserir")
    public String novaConta(
            @RequestParam(name = "login") String login,
            @RequestParam(name = "senha") String senha,
            @RequestParam(name = "nome") String nome,
            @RequestParam(name = "cargo") String cargo) {
        controladorLogin.addConta(login, senha, nome, cargo);
        return "redirect:/";
    }

    @GetMapping("/conta/efetuarLogin")
    public String login(RedirectAttributes redirAttrs, @RequestParam(name = "login") String login,
            @RequestParam(name = "senha") String senha) {
        try {
            Long contaId = controladorLogin.efetuarLogin(login, senha);
            return "redirect:/funcionario/" + contaId;
        } catch (Exception e) {
            redirAttrs.addFlashAttribute("error", "Login ou senha incorretos.");
            return "redirect:/";
        }
    }
}
