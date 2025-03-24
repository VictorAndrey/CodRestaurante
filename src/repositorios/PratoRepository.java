package repositorios;

import java.util.ArrayList;

import prorestaurante.Pratos;

public class PratoRepository {
	private ArrayList<Pratos> pratos;
	
	public PratoRepository(ArrayList<Pratos> pratos) {
		this.pratos = pratos;
	}
	
	public void adicionarfila (Pratos prato) {
		pratos.add(prato);
	}
	public Pratos removerfila () {
		return pratos.remove(0);
	}
	
	public Pratos getproximoPedido() {
		return pratos.get(0);
	}
}
