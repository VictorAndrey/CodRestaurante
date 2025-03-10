package prorestaurante;
import java.util.ArrayList;

public class FuncionarioRepository {
	private ArrayList<Funcionario> funcionarios;
	private int proximoId;
	
	public FuncionarioRepository() {
		this.funcionarios = new ArrayList<>();
			}
	
	public void salvar (Funcionario funcionario) {
		funcionarios.add(funcionario);
	}
	
	public int getProximoId() {
		return proximoId++;
	}
	
	public Funcionario buscarPorId(int id) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getID() == id) {
                return funcionario;
            }
        }
        return null;
	}
}
