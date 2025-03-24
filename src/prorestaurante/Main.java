package prorestaurante;

import java.util.ArrayList;

import repositorios.FuncionarioRepository;
import repositorios.PratoRepository;
import serviços.FuncionarioService;
import serviços.PratoService;

public class Main {

	public static void main(String[] args) {
	ArrayList<Funcionario> funcionarios = new ArrayList<>();
	FuncionarioRepository repository = new FuncionarioRepository(funcionarios);
	FuncionarioService service = new FuncionarioService(repository);
	
	ArrayList<Pratos> pratos = new ArrayList<>();
	PratoRepository repositoryPratos = new PratoRepository(pratos);
	PratoService servicePratos = new PratoService(repositoryPratos);
	
	Pratos prato = new Pratos("Lasanha", 10.50);
	Pratos prato2 = new Pratos("Biscoito", 50);
	Funcionario funcionario = new Funcionario("Gabriel", 20, "16558856425", "Recife", 1, "cozinheiro", 1500);
	
	
	servicePratos.salvarprato(prato);
	servicePratos.salvarprato(prato2);
	System.out.println(servicePratos.VerPedido());
	
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
