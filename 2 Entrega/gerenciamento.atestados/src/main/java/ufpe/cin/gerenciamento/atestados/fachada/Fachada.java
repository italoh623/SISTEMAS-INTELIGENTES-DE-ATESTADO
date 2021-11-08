package ufpe.cin.gerenciamento.atestados.fachada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ufpe.cin.gerenciamento.atestados.controladores.ControladorLogin;
import ufpe.cin.gerenciamento.atestados.controladores.ControladorPedidoAbono;
import ufpe.cin.gerenciamento.atestados.entidades.PedidoAbono;

@Component
public class Fachada {

    private ControladorLogin controladorLogin;
    private ControladorPedidoAbono controladorPedidoAbono;
    private IFabricaAbstrataRepositorio fabricaAbstrataRepositorio;

    public Fachada() {
        this.fabricaAbstrataRepositorio = new FabricaRepositorioBDR();
        this.controladorLogin = new ControladorLogin(
                fabricaAbstrataRepositorio.criarRepositorioConta(),
                fabricaAbstrataRepositorio.criarRepositorioFuncionario());
        this.controladorPedidoAbono = new ControladorPedidoAbono(fabricaAbstrataRepositorio.criarRepositorioPedidoAbono());
    }

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
