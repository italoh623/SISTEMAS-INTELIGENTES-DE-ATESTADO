package ufpe.cin.gerenciamento.atestados.cadastros;

import org.springframework.stereotype.Component;

import ufpe.cin.gerenciamento.atestados.entidades.PedidoAbono;
import ufpe.cin.gerenciamento.atestados.repositorios.IRepositorioPedidoAbono;

@Component
public class CadastroPedidoAbono {

    private IRepositorioPedidoAbono repositorioPedidoAbono;

    public CadastroPedidoAbono(IRepositorioPedidoAbono repositorioPedidoAbono) {
        this.repositorioPedidoAbono = repositorioPedidoAbono;
    }

    public void criarPedidoAbono(PedidoAbono pedidoAbono) {
    }

    public void enviarPedidoAbono(PedidoAbono pedidoAbono) {
    }

    public void mostrarNotificacao() {
        
    }
}
