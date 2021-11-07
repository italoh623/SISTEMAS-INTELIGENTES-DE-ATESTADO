package ufpe.cin.gerenciamento.atestados.cadastros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ufpe.cin.gerenciamento.atestados.entidades.Conta;
import ufpe.cin.gerenciamento.atestados.repositorios.IRepositorioConta;

import java.util.List;

@Component
public class CadastroConta {

    public CadastroConta() {

    }

    @Autowired
    private IRepositorioConta repositorioConta;

    public String getSenhaByLogin(String login) {
        String senha = "senha default";
        List<Conta> contas = (List<Conta>) repositorioConta.findAll();
        if (contas.size() > 0) return contas.get(0).getSenha();
        return senha;
    }

    public void efetuarLogin(String login, String senha) {
    }

    public void addConta(Conta conta) {
        repositorioConta.save(conta);
    }
}
