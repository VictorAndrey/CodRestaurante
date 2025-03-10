package prorestaurante;

public class Funcionario extends Pessoa {
	private int numMatricula;
	private String cargo;
	private double salario;
	
	
	public Funcionario(String nome, int idade, String cpf, String endereco,
			int numMatricula, String cargo, double salario) {
		super(nome, idade, cpf, endereco);
		this.numMatricula = numMatricula;
		this.cargo = cargo;
		this.salario = salario;
	}


	public int getNumMatricula() {
		return numMatricula;
	}


	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	@Override
	public void ExibirID() {
		System.out.println("ID :" + getID());
	}
	
	@Override
	public void apresentacao() {
		System.out.println("Nome: " + getNome() + ", Idade: " + getIdade()+", CPF: "+getCpf()+ ", Endereço: "+getEndereco() + ", Matricula: "+getNumMatricula() + ", Cargo : "+getCargo() + ", Salario: "+getSalario());
	}
	

}
