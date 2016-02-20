package br.edu.ifpb.atividade.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.edu.ifpb.atividade.entidade.Pessoa;

@RequestScoped
@ManagedBean
public class PessoaBean {
	
	private Pessoa pessoa;
	
	public PessoaBean(){
		
	}
	public String enviar(){
		return null;
		
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	

}
