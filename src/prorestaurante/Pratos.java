package prorestaurante;

public class Pratos {
	private String nome;
	private int proxPedido;
	private double preço;
	
	public Pratos(String nome, double preço) {
		this.nome = nome;
		this.preço = preço;
	}
	
	public void setnome(String nome) {
		this.nome = nome;
	}
	public String getnome(){
		return nome;
	}
	
	public void setpreço(double preço) {
		this.preço = preço;
	}
	public double getpreço() {
		return this.preço;
	}
	
	public void setproxPedido(int proxPedido) {
		this.proxPedido = proxPedido;
	}
	public double getproxPedido() {
		return this.proxPedido;
	}

	@Override
	public String toString() {
		return "Pratos [nome=" + nome + ", preço=" + preço + "]";
	}
	
	
	
}
