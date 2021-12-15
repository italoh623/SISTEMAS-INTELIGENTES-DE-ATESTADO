package ufpe.cin.gerenciamento.atestados.model;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CadastroConta {

    private IRepositorioConta repositorioConta;

    public CadastroConta(IRepositorioConta repositorioConta) {
        this.repositorioConta = repositorioConta;
    }

    public String getSenhaByLogin(String login) {
        List<Conta> contas = (List<Conta>) repositorioConta.getAll();

        for (Conta conta : contas) {
            if (conta.getLogin().equals(login)) {
                return conta.getSenha();
            }
        }

        return "Login Inválido";
    }

    public Conta addConta(Conta conta) {
        return repositorioConta.inserir(conta);
    }

    public Long efetuarLogin(String login, String senha) throws Exception {
        List<Conta> contas = (List<Conta>) repositorioConta.getAll();

        for (Conta conta : contas) {
            if (conta.getLogin().equals(login)) {
                if (conta.getSenha().equals(senha)) {
                    return conta.getId();
                }
                throw new Exception("Senha Incorreta");
            }
        }
        throw new Exception("Usuário inexistente");
    }
}
