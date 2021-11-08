package ufpe.cin.gerenciamento.atestados.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ufpe.cin.gerenciamento.atestados.entidades.Conta;

@Component
public class Fachada {

    @Autowired
    private ControladorLogin controladorLogin;

    public String recuperarSenha(String login) {
        return controladorLogin.recuperarSenha(login);
    }

    public void addConta(String login, String senha, String nome, String cargo) {
        controladorLogin.addConta(login, senha, nome, cargo);
    }

    public Long efetuarLogin(String login, String senha) throws Exception {
        return controladorLogin.efetuarLogin(login, senha);
    }
}
