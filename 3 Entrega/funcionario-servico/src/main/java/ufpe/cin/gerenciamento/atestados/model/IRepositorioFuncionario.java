package ufpe.cin.gerenciamento.atestados.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import ufpe.cin.gerenciamento.atestados.entidades.Funcionario;

import java.util.List;

public interface IRepositorioFuncionario {

    public void inserir(Funcionario funcionario);

    public List<Funcionario> getAll();
    
}
