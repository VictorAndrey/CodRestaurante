package serviços;

import entidades.Funcionario;
import entidades.Pessoa;
import repositorios.FuncionarioRepository;

public class FuncionarioService {
	private FuncionarioRepository repository;
	
	
	public FuncionarioService(FuncionarioRepository repository) {
		this.repository = repository;
	}
	
	public boolean validarIdade(Pessoa pessoa) {
		return pessoa.getIdade() >= 18;
	}
	
	
	public boolean validarCPFTamanho(Pessoa pessoa) {
	        String cpf = pessoa.getCpf();
	        if (cpf != null && cpf.length() == 11) {
	            return true;
	        } else {
	            return false;
	        }
	}
	public void cadastrarFuncionario(Funcionario funcionario) {
		funcionario.setID(repository.getProximoId());
		repository.salvar(funcionario);
	}
}
