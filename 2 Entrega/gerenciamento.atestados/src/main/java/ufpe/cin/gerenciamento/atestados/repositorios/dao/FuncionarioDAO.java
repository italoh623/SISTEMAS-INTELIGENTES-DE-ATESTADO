package ufpe.cin.gerenciamento.atestados.repositorios.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ufpe.cin.gerenciamento.atestados.entidades.Funcionario;

public interface FuncionarioDAO extends JpaRepository<Funcionario, Long> {
}
