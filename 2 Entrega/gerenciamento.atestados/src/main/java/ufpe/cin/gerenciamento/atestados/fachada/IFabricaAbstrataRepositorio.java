package ufpe.cin.gerenciamento.atestados.fachada;

import ufpe.cin.gerenciamento.atestados.repositorios.IRepositorioConta;
import ufpe.cin.gerenciamento.atestados.repositorios.IRepositorioFuncionario;
import ufpe.cin.gerenciamento.atestados.repositorios.IRepositorioPedidoAbono;

public interface IFabricaAbstrataRepositorio {
    public IRepositorioConta criarRepositorioConta();
    public IRepositorioFuncionario criarRepositorioFuncionario();
    public IRepositorioPedidoAbono criarRepositorioPedidoAbono();
    
}
