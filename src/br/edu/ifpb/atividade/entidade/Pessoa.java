package br.edu.ifpb.atividade.entidade;

public class Pessoa {
	
	private String Nome;
	
	private String dataNascimento;
	
	private String Matricula;
	
	public Pessoa(){
		
	}

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
	

}
