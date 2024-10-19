package projetoSolo;

public class Clientes {
	public String nome;
	public String endereco;
	public String formadepagamento;
	public String email;
	public int telefone;
	
	
	public Clientes() {
		
	}
	
	public Clientes(String nome,String endereco,String formadepagamento,String email,int telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.formadepagamento = formadepagamento;
		this.email = email;
		this.telefone = telefone;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return nome;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getformadepagamento() {
		return formadepagamento;
	}
	public void setformadepagamento(String formadepagamento) {
		this.formadepagamento = formadepagamento;
	}
	
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	
	public int gettelefone() {
		return telefone;
	}
	public void settelefone(int telefone) {
		this.telefone = telefone;
	}
	
	
	
}
