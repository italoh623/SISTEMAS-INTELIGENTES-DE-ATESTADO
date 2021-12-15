package ufpe.cin.gerenciamento.atestados.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ControladorLogin {

    @Autowired
    private CadastroConta cadastroConta;
    private IFuncionarioService funcionarioService = new FuncionarioService();
    private IGerarSenhaService gerarSenhaService = new GerarSenhaService();

    public ControladorLogin() {
    }

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
        Integer funcionarioId = funcionarioService.addFuncionario(nome, cargo);

        Conta conta = new Conta(login, senha, new Long(funcionarioId.intValue()));

        Conta conta1 = cadastroConta.addConta(conta);
    }

    public Long efetuarLogin(String login, String senha) throws Exception {
        return cadastroConta.efetuarLogin(login, senha);
    }

    public String gerarSenha() {
        return gerarSenhaService.gerarSenha();
    }
}
