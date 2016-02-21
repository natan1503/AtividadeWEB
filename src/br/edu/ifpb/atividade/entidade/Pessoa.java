package br.edu.ifpb.atividade.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pessoas")
@NamedQuery(name = "Pessoa.getAll", query= " from Pessoa")
public class Pessoa {

	@Column (name = "nome")
	private String Nome;

	@Column (name = "dataNascimento")
	private String dataNascimento;
	
	@Column (name = "matricula")
	private String Matricula;


	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getMatricula() {
		return Matricula;
	}

	public void setMatricula(String matricula) {
		Matricula = matricula;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + Nome + ", nascimento="
				+ dataNascimento + ", matricula=" + Matricula + "]";
	}

}
