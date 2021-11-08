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

    public void addConta(String login, String senha, String nome, String cargo) {
        controladorLogin.addConta(login, senha, nome, cargo);
    }

    public Long efetuarLogin(String login, String senha) throws Exception {
        return controladorLogin.efetuarLogin(login, senha);
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
