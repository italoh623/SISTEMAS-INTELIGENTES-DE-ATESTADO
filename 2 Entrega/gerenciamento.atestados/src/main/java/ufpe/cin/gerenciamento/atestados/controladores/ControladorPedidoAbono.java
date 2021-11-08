package ufpe.cin.gerenciamento.atestados.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ufpe.cin.gerenciamento.atestados.cadastros.CadastroPedidoAbono;
import ufpe.cin.gerenciamento.atestados.entidades.PedidoAbono;

@Component
public class ControladorPedidoAbono {
    
    @Autowired
    private CadastroPedidoAbono cadastroPedidoAbono;

    ControladorPedidoAbono() {

    }

    ControladorPedidoAbono(CadastroPedidoAbono cadastroPedidoAbono) {
        this.cadastroPedidoAbono = cadastroPedidoAbono;
    }

    public CadastroPedidoAbono getCadastroPedidoAbono() {
        return cadastroPedidoAbono;
    }

    public void setCadastroPedidoAbono(CadastroPedidoAbono cadastroPedidoAbono) {
        this.cadastroPedidoAbono = cadastroPedidoAbono;
    }

    public void criarPedidoAbono(PedidoAbono pedidoAbono) {
        cadastroPedidoAbono.criarPedidoAbono(pedidoAbono);
    }

    public void enviarPedidoAbono(PedidoAbono pedidoAbono) {
        cadastroPedidoAbono.enviarPedidoAbono(pedidoAbono);
    }

    public void mostrarNotificacao() {
        cadastroPedidoAbono.mostrarNotificacao();
    }
}
