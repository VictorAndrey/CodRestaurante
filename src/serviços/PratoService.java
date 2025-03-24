package serviços;

import prorestaurante.Pratos;
import repositorios.PratoRepository;

public class PratoService {
	private PratoRepository repository;
	
	public PratoService(PratoRepository repository) {
		this.repository = repository;
	}
	
	public void salvarprato (Pratos prato) {
		repository.adicionarfila(prato);
	}
	public void RemoverPrato() {
		repository.removerfila();
	}
	public Pratos VerPedido() {
		return repository.getproximoPedido();
	}
}
