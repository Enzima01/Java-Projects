package entities;

import java.util.ArrayList;
import java.util.List;

public class Departamento {

	private String nome;
	List<Funcionario> funcionarios = new ArrayList<>();

	public Departamento() {
	}

	public Departamento(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void addFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for (Funcionario funcionario : funcionarios) {
			sb.append(funcionario.getNome() + " (" + funcionario.getCargo() + ", " + funcionario.getIdade() + " anos)\n");
		}
		
		return sb.toString();
	}

}
