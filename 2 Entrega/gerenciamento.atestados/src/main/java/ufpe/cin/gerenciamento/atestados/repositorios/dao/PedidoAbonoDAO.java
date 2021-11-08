package ufpe.cin.gerenciamento.atestados.repositorios.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ufpe.cin.gerenciamento.atestados.entidades.PedidoAbono;

public interface PedidoAbonoDAO extends JpaRepository<PedidoAbono, Long> {
}
