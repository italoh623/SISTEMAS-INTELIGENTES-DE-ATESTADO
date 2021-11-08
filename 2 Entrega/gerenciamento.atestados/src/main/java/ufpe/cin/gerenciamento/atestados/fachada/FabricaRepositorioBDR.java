package ufpe.cin.gerenciamento.atestados.fachada;

import ufpe.cin.gerenciamento.atestados.repositorios.*;

public class FabricaRepositorioBDR implements IFabricaAbstrataRepositorio{

    public FabricaRepositorioBDR() {}

    @Override
    public IRepositorioConta criarRepositorioConta() {
        return new RepositorioContaBDR();
    }

    @Override
    public IRepositorioFuncionario criarRepositorioFuncionario() {
        return new RepositorioFuncionarioBDR();
    }

    @Override
    public IRepositorioPedidoAbono criarRepositorioPedidoAbono() {
        return new RepositorioPedidoAbonoBDR();
    }
}
