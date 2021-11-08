package ufpe.cin.gerenciamento.atestados.repositorios;

public interface FabricaAbstrataRepositorio {
    public IRepositorioConta criarRepositorioConta();
    public IRepositorioFuncionario criarRepositorioFuncionario();
    public IRepositorioPedidoAbono criarRepositorioPedidoAbono();
    
}
