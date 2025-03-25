package repositorios;

import java.util.ArrayList;

import entidades.Prato;

public class PratoRepository {
	private ArrayList<Prato> pratos;
	
	public PratoRepository(ArrayList<Prato> pratos) {
		this.pratos = pratos;
	}
	
	public void enfileirar (Prato prato) {
		pratos.add(prato);
	}
	public Prato desfileirar () {
		return pratos.remove(0);
	}
	
	public Prato getproximoPedido() {
		return pratos.get(0);
	}
	
	public boolean atualizarPratoPorId(int numPedido, String novoNome, double novoPreco) {
        for (Prato prato : pratos) {
            if (prato.getproxPedido() == numPedido) {
                prato.setnome(novoNome);
                prato.setpreço(novoPreco);
                return true; 
            }
        }
        return false;
    }

}
