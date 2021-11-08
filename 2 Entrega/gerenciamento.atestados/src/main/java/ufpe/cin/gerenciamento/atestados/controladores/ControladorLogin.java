package ufpe.cin.gerenciamento.atestados.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ufpe.cin.gerenciamento.ComunicaçãoGeradorSenha.ComunicaçãoGeradorSenha;
import ufpe.cin.gerenciamento.ComunicaçãoGeradorSenha.InterfaceComunicaçãoGeradorSenha;
import ufpe.cin.gerenciamento.atestados.cadastros.CadastroConta;
import ufpe.cin.gerenciamento.atestados.cadastros.CadastroFuncionario;
import ufpe.cin.gerenciamento.atestados.entidades.Conta;
import ufpe.cin.gerenciamento.atestados.entidades.Funcionario;
import ufpe.cin.gerenciamento.atestados.repositorios.IRepositorioConta;
import ufpe.cin.gerenciamento.atestados.repositorios.IRepositorioFuncionario;

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
