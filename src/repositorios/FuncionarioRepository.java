package repositorios;
import java.util.ArrayList;

import prorestaurante.Funcionario;

public class FuncionarioRepository {
	private ArrayList<Funcionario> funcionarios;
	private int proximoId;
	
	public FuncionarioRepository(ArrayList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
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
