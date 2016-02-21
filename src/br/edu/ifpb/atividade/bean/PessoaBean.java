package br.edu.ifpb.atividade.bean;

import java.io.IOException;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import br.edu.ifpb.atividade.bancodedados.PessoaDAO;
import br.edu.ifpb.atividade.entidade.Pessoa;

@RequestScoped
@ManagedBean(name="PessoaBean", eager = true)
public class PessoaBean {

	public PessoaBean(){
		
	}
	public String enviar(){
		return null;
		
	}
	private Pessoa pessoa = new Pessoa();

	public List<Pessoa> getPessoas() {
		return new PessoaDAO().getAll();
	}

	public void registrar() {
		new PessoaDAO().insert(pessoa);
		try {
			FacesContext.getCurrentInstance().getExternalContext()
			.redirect("quest.xhtml");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	

}
