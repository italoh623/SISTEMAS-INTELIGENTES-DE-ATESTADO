package ufpe.cin.gerenciamento.atestados.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import ufpe.cin.gerenciamento.atestados.entidades.Conta;

public interface IRepositorioConta extends JpaRepository<Conta, Long> {
    
}
