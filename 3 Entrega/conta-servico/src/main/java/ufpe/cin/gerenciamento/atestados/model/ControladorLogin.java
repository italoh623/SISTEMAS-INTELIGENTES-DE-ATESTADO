package ufpe.cin.gerenciamento.atestados.model;

import org.springframework.stereotype.Component;

import ufpe.cin.gerenciamento.atestados.Comunicação.ComunicaçãoGeradorSenha;
import ufpe.cin.gerenciamento.atestados.Comunicação.InterfaceComunicaçãoGeradorSenha;

@Component
public class ControladorLogin {

    private CadastroConta cadastroConta;
    private IFuncionarioService funcionarioService= new FuncionarioService();
    private InterfaceComunicaçãoGeradorSenha geradorSenha = new ComunicaçãoGeradorSenha();

    public ControladorLogin() {}

    public ControladorLogin(IRepositorioConta repositorioConta) {
        this.cadastroConta = new CadastroConta(repositorioConta);
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
        String funcionarioId = funcionarioService.addFuncionario(nome, cargo);

        /* Conta conta = new Conta(login, senha, funcionarioId);

        Conta conta1 = cadastroConta.addConta(conta); */

        System.out.println("AQUIIII " + funcionarioId);
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
