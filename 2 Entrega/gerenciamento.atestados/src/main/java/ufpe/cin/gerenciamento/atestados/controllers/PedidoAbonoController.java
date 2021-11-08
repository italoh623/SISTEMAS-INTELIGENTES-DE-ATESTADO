package ufpe.cin.gerenciamento.atestados.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ufpe.cin.gerenciamento.atestados.controladores.Fachada;
import ufpe.cin.gerenciamento.atestados.entidades.PedidoAbono;

@Controller
public class PedidoAbonoController {

    @Autowired
    Fachada fachada;
    private static final AtomicLong idCounter = new AtomicLong();

    @GetMapping(path = "/criarPedidoAbono")
    public void criarPedidoAbono(@RequestParam(name = "inicio") String inicio, @RequestParam(name = "fim") String fim, @RequestParam(name = "justificativa") String justificativa) {
        // Conta conta = new Conta(login, "senha123");
        // fachada.addConta(conta);
        // PedidoAbono pedidoAbono = new PedidoAbono();
        // return "redirect:/registrarConta";
        System.out.println(inicio + fim + justificativa);
        return;
    }

    @GetMapping(path = "/registrarPedidoAbono")
    public void enviarPedidoAbono(PedidoAbono pedidoAbono) {
        return;
    }

    @GetMapping(path = "/mostrarNotificacao")
    public void mostrarNotificacao() {
        return;
    }
}
