package ufpe.cin.gerenciamento.atestados.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ufpe.cin.gerenciamento.atestados.entidades.Conta;
import ufpe.cin.gerenciamento.atestados.entidades.PedidoAbono;

@Component
public class Fachada {

    @Autowired
    private ControladorLogin controladorLogin;
    private ControladorPedidoAbono controladorPedidoAbono;

    public String recuperarSenha(String login) {
        return controladorLogin.recuperarSenha(login);
    }

    public void addConta(Conta conta) {
        controladorLogin.addConta(conta);
    }

    public void efetuarLogin(Conta conta) throws Exception {
        controladorLogin.efetuarLogin(conta);
    }

    public void criarPedidoAbono(PedidoAbono pedidoAbono) {
        controladorPedidoAbono.criarPedidoAbono(pedidoAbono);
    }

    public void enviarPedidoAbono(PedidoAbono pedidoAbono) {
        controladorPedidoAbono.enviarPedidoAbono(pedidoAbono);
    }

    public void mostrarNotificacao() {
        controladorPedidoAbono.mostrarNotificacao();
    }
}
