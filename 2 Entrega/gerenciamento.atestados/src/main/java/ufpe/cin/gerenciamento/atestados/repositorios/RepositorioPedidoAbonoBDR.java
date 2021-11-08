package ufpe.cin.gerenciamento.atestados.repositorios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ufpe.cin.gerenciamento.atestados.ApplicationContextHolder;
import ufpe.cin.gerenciamento.atestados.repositorios.dao.PedidoAbonoDAO;

@Component
public class RepositorioPedidoAbonoBDR implements IRepositorioPedidoAbono{
    @Autowired
    private PedidoAbonoDAO pedidoAbonoDAO;

    public RepositorioPedidoAbonoBDR(){
        this.pedidoAbonoDAO = ApplicationContextHolder.getContext().getBean(PedidoAbonoDAO.class);
    }
}
