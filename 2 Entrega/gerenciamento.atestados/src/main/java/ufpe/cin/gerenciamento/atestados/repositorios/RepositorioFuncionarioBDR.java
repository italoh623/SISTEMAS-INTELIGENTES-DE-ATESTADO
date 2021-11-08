package ufpe.cin.gerenciamento.atestados.repositorios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ufpe.cin.gerenciamento.atestados.ApplicationContextHolder;
import ufpe.cin.gerenciamento.atestados.entidades.Conta;
import ufpe.cin.gerenciamento.atestados.entidades.Funcionario;
import ufpe.cin.gerenciamento.atestados.repositorios.dao.ContaDAO;
import ufpe.cin.gerenciamento.atestados.repositorios.dao.FuncionarioDAO;

import java.util.List;

@Component
public class RepositorioFuncionarioBDR implements IRepositorioFuncionario {
    @Autowired
    private FuncionarioDAO funcionarioDAO;

    public RepositorioFuncionarioBDR(){
        this.funcionarioDAO = ApplicationContextHolder.getContext().getBean(FuncionarioDAO.class);
    }

    @Override
    public void inserir(Funcionario funcionario) {
        funcionarioDAO.save(funcionario);
    }

    @Override
    public List<Funcionario> getAll() {
        return funcionarioDAO.findAll();
    }
}
