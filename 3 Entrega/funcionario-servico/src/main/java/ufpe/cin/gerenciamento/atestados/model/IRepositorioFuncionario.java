package ufpe.cin.gerenciamento.atestados.model;

import java.util.List;
import java.util.Optional;

public interface IRepositorioFuncionario {

    public long inserir(Funcionario funcionario);

    public Optional<Funcionario> findById(Long id);

    public List<Funcionario> getAll();
    
}
