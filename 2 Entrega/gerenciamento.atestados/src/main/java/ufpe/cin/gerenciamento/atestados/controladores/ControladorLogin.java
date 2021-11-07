package ufpe.cin.gerenciamento.atestados.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ufpe.cin.gerenciamento.atestados.cadastros.CadastroConta;
import ufpe.cin.gerenciamento.atestados.entidades.Conta;

@Component
public class ControladorLogin {

    @Autowired
    private CadastroConta cadastroConta;

    public ControladorLogin() {

    }

    public ControladorLogin(CadastroConta cadastroConta) {
        this.cadastroConta = cadastroConta;
    }

    public CadastroConta getCadastroConta() {
        return cadastroConta;
    }

    public void setCadastroConta(CadastroConta cadastroConta) {
        this.cadastroConta = cadastroConta;
    }

    public void efetuarLogin(String login, String senha) {
        cadastroConta.efetuarLogin(login, senha);
    }

    public String recuperarSenha(String login) {
        return cadastroConta.getSenhaByLogin(login);
    }

    public void addConta(Conta conta) {
        cadastroConta.addConta(conta);
    }
}
