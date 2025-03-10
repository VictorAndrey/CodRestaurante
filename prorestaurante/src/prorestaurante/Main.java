package prorestaurante;


public class Main {

	public static void main(String[] args) {
	FuncionarioRepository repository = new FuncionarioRepository();
	FuncionarioService service = new FuncionarioService(repository);
	
	
	Funcionario funcionario = new Funcionario("Gabriel", 20, "16558856425", "Recife", 1, "cozinheiro", 1500);
	
	try {
		service.cadastrarFuncionario(funcionario);
		if (service.validarCPFTamanho(funcionario)) {
			System.out.println("cpf correto");
		}
		if (service.validarIdade(funcionario)) {
			System.out.println("Maior de idade");
			
			Funcionario funcionarioencontrado = repository.buscarPorId(0);
            if (funcionarioencontrado != null) {
            	funcionarioencontrado.apresentacao();
            }
		}
	} catch (IllegalArgumentException e) {
        System.out.println("Erro: " + e.getMessage());
    }
	
	}
	

}
