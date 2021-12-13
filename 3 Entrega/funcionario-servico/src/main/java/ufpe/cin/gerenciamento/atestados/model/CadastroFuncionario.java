package ufpe.cin.gerenciamento.atestados.model;

import org.springframework.stereotype.Component;

@Component
public class CadastroFuncionario {

    private IRepositorioFuncionario repositorioFuncionario;

    public CadastroFuncionario(IRepositorioFuncionario repositorioFuncionario) {
        this.repositorioFuncionario = repositorioFuncionario;
    }

    public void addFuncionario(Funcionario funcionario) {
        repositorioFuncionario.inserir(funcionario);
    }
}
