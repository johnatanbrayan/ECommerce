package br.com.johnatanbrayan.domain.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;

import br.com.johnatanbrayan.domain.Categoria;

public class CategoriaDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	@NotEmpty(message="Nome não pode estar vazio.")
	@Length(min=5, max=80, message="Nome tem que ser entre 5 e 80 caracteres.")
	private String nome; 
	
	public CategoriaDTO() {}
	
	public CategoriaDTO(Long id, String nome) {
		this.id = id; 
		this.nome = nome; 
	}
	
	public CategoriaDTO(Categoria obj) {
		this.id = obj.getId();
		this.nome = obj.getNome();
	}
	
	public Long getId() { return this.id; }
	public void setId(Long id) { this.id = id; }
	
	public String getNome() { return this.nome; }
	public void setNome(String nome) { this.nome = nome; }
}
