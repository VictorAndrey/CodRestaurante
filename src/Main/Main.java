package Main;

import java.util.ArrayList;

import entidades.Funcionario;
import entidades.Prato;
import repositorios.FuncionarioRepository;
import repositorios.PratoRepository;
import serviços.FuncionarioService;
import serviços.PratoService;

public class Main {

	public static void main(String[] args) {
	ArrayList<Funcionario> funcionarios = new ArrayList<>();
	FuncionarioRepository repository = new FuncionarioRepository(funcionarios);
	FuncionarioService service = new FuncionarioService(repository);
	
	ArrayList<Prato> pratos = new ArrayList<>();
	PratoRepository repositoryPratos = new PratoRepository(pratos);
	PratoService servicePratos = new PratoService(repositoryPratos);
	
	Prato prato = new Prato("Lasanha", 10.50);
	Prato prato2 = new Prato("Biscoito", 50);
	Funcionario funcionario = new Funcionario("Gabriel", 20, "16558856425", "Recife", 1, "cozinheiro", 1500);
	
	
	servicePratos.enfileirar(prato);
	servicePratos.enfileirar(prato2);
	servicePratos.atualizarPrato(0, "cuzcus", 40);
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
