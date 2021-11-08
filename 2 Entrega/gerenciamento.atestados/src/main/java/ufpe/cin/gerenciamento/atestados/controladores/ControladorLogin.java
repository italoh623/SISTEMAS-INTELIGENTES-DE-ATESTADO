package ufpe.cin.gerenciamento.atestados.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ufpe.cin.gerenciamento.atestados.cadastros.CadastroConta;
import ufpe.cin.gerenciamento.atestados.cadastros.CadastroFuncionario;
import ufpe.cin.gerenciamento.atestados.entidades.Conta;
import ufpe.cin.gerenciamento.atestados.entidades.Funcionario;

@Component
public class ControladorLogin {

    @Autowired
    private CadastroConta cadastroConta;

    @Autowired
    private CadastroFuncionario cadastroFuncionario;

    public ControladorLogin() {}

    public ControladorLogin(CadastroConta cadastroConta) {
        this.cadastroConta = cadastroConta;
    }

    public CadastroConta getCadastroConta() {
        return cadastroConta;
    }

    public void setCadastroConta(CadastroConta cadastroConta) {
        this.cadastroConta = cadastroConta;
    }

    public String recuperarSenha(String login) {
        return cadastroConta.getSenhaByLogin(login);
    }

    public void addConta(String login, String senha, String nome, String cargo) {
        Funcionario funcionario = new Funcionario(nome, cargo);
        cadastroFuncionario.addFuncionario(funcionario);

        Conta conta = new Conta(login, senha, funcionario);

        Conta conta1 = cadastroConta.addConta(conta);
    }

    public Long efetuarLogin(String login, String senha) throws Exception {
        return cadastroConta.efetuarLogin(login, senha);
    }
}
