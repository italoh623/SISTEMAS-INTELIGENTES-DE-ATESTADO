package ufpe.cin.gerenciamento.atestados.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ufpe.cin.gerenciamento.atestados.ApplicationContextHolder;
import java.util.List;
import java.util.Optional;

@Component
public class RepositorioFuncionarioBDR implements IRepositorioFuncionario {
    @Autowired
    private FuncionarioDAO funcionarioDAO;

    public RepositorioFuncionarioBDR(){
        this.funcionarioDAO = ApplicationContextHolder.getContext().getBean(FuncionarioDAO.class);
    }

    @Override
    public long inserir(Funcionario funcionario) {
        Long id = funcionarioDAO.save(funcionario).getId();
        return id;
    }

    @Override
    public List<Funcionario> getAll() {
        return funcionarioDAO.findAll();
    }

    @Override
    public Optional<Funcionario> findById(Long id) {
        return funcionarioDAO.findById(id);
    }
}
