package ufpe.cin.gerenciamento.atestados.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ufpe.cin.gerenciamento.atestados.Comunicação.ComunicaçãoGeradorSenha;
import ufpe.cin.gerenciamento.atestados.Comunicação.InterfaceComunicaçãoGeradorSenha;

@Component
public class ControladorLogin {

    private CadastroConta cadastroConta;
    private CadastroFuncionario cadastroFuncionario;
    private InterfaceComunicaçãoGeradorSenha geradorSenha = new ComunicaçãoGeradorSenha();

    public ControladorLogin() {}

    public ControladorLogin(IRepositorioConta repositorioConta, IRepositorioFuncionario repositorioFuncionario) {
        this.cadastroConta = new CadastroConta(repositorioConta);
        this.cadastroFuncionario = new CadastroFuncionario(repositorioFuncionario);
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

    public String gerarSenha() {
        try {
            return geradorSenha.gerarSenha();
        } catch (Exception exception) {
            return "";
        }  
    }
}
