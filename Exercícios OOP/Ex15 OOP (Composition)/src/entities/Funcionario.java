package entities;

import entities.enums.Cargo;

public class Funcionario {

	private String nome;
	private int idade;
	private Cargo cargo;
	private Departamento departamento;

	public Funcionario() {
	}

	public Funcionario(String nome, int idade, Cargo cargo, Departamento departamento) {
		this.nome = nome;
		this.idade = idade;
		this.cargo = cargo;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

}
