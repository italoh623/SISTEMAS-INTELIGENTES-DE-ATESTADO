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

    public void addConta(Conta conta) {
        controladorLogin.addConta(conta);
    }

    public void efetuarLogin(Conta conta) throws Exception {
        controladorLogin.efetuarLogin(conta);
    }
}
