package prorestaurante;

public abstract class Pessoa implements IPessoa {
	private String nome;
	private int idade;
	private String cpf;
	private String endereco;
	private int ID;
	
	
	public Pessoa(String nome, int idade, String cpf, String endereco) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
	
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getIdade() {
		return idade;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCpf() {
		return cpf;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEndereco() {
		return endereco;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}
	public int getID() {
		return ID;
	}
	
	
	@Override
	public void ExibirID() {
		System.out.println("ID :" + ID);
	}
	@Override
	public void apresentacao() {
		System.out.println("Nome: " + getNome() + ", Idade: " + getIdade()+", CPF: "+getCpf()+", Endereço: "+getEndereco());
	}
	
}
