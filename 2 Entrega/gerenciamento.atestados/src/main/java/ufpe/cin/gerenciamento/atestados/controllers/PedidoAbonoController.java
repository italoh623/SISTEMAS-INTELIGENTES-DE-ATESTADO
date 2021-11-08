package ufpe.cin.gerenciamento.atestados.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ufpe.cin.gerenciamento.atestados.controladores.Fachada;
import ufpe.cin.gerenciamento.atestados.entidades.Funcionario;
import ufpe.cin.gerenciamento.atestados.entidades.PedidoAbono;

@Controller
public class PedidoAbonoController {

    @Autowired
    Fachada fachada;
    private static final AtomicLong idCounter = new AtomicLong();


    @GetMapping(path = "/pedidoabono")
    public String registrarConta(Model model) {
        return "pedidoabono";
    }

    @GetMapping(path = "/pedidoabono/criar")
    public String criarPedidoAbono(Model model, @RequestParam(name = "inicio") String inicio, @RequestParam(name = "fim") String fim, @RequestParam(name = "justificativa") String justificativa) {
        model.addAttribute("inicio", inicio);
        model.addAttribute("fim", fim);
        model.addAttribute("justificativa", justificativa);

        Funcionario funcionario = new Funcionario();
        PedidoAbono pedidoAbono = new PedidoAbono(funcionario, "07/11/2021", "04/10/2021", "19/10/2021", "Suspeita de Covid-19");
        System.out.println(pedidoAbono.getInicio());
        fachada.enviarPedidoAbono(pedidoAbono);
        return "/pedidoabono";
    }

    @GetMapping(path = "/pedidoabono/enviar")
    public void enviarPedidoAbono() {
        
    }

    @GetMapping(path = "/mostrarNotificacao")
    public void mostrarNotificacao() {
        return;
    }
}
