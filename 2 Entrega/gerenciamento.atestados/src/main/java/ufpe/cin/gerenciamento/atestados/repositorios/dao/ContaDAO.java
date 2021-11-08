package ufpe.cin.gerenciamento.atestados.repositorios.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ufpe.cin.gerenciamento.atestados.entidades.Conta;

public interface ContaDAO extends JpaRepository<Conta, Long> {
}
