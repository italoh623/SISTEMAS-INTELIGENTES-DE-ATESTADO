package ufpe.cin.gerenciamento.atestados.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import ufpe.cin.gerenciamento.atestados.entidades.PedidoAbono;

public interface IRepositorioPedidoAbono extends JpaRepository<PedidoAbono, Long> {
    
}
