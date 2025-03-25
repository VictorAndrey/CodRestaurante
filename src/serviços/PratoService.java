package serviços;

import entidades.Prato;
import repositorios.PratoRepository;

public class PratoService {
	private PratoRepository repository;
	
	public PratoService(PratoRepository repository) {
		this.repository = repository;
	}
	
	public void enfileirar (Prato prato) {
		repository.enfileirar(prato);
	}
	public void desfileirar() {
		repository.desfileirar();
	}
	public Prato VerPedido() {
		return repository.getproximoPedido();
	}
	public boolean atualizarPrato(int numPedido, String novoNome, double novoPreco) {
        return repository.atualizarPratoPorId(numPedido, novoNome, novoPreco);
    }

}
