package ufpe.cin.gerenciamento.atestados.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ufpe.cin.gerenciamento.atestados.entidades.Conta;

@Component
public class Fachada {

    @Autowired
    private ControladorLogin controladorLogin;

    public void efetuarLogin(String login, String senha) {
        controladorLogin.efetuarLogin(login, senha);
    }

    public String recuperarSenha(String login) {
        return controladorLogin.recuperarSenha(login);
    }

    public void addConta(Conta conta) {
        controladorLogin.addConta(conta);
    }
}
