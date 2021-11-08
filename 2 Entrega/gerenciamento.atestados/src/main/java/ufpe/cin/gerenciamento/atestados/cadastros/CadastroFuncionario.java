package ufpe.cin.gerenciamento.atestados.cadastros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ufpe.cin.gerenciamento.atestados.entidades.Funcionario;
import ufpe.cin.gerenciamento.atestados.repositorios.IRepositorioFuncionario;

@Component
public class CadastroFuncionario {

    @Autowired
    private IRepositorioFuncionario repositorioFuncionario;

    public void addFuncionario(Funcionario funcionario) {
        repositorioFuncionario.save(funcionario);
    }
}
