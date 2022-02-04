package br.org.loja.minhaLojaDeGames.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")
public class Produto {
	
	@OneToMany 
	@JsonIgnoreProperties ( " produto	 " )
	 private List < Categoria > categoria;
	
	
	
	@OneToMany
	@JsonIgnoreProperties("produto")
	private Usuario usuario;


	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;


	@NotNull
	@Size(min = 3 , max=255, message= "deve conter textos ou palavras com tamanho  3 a 255 caracteres " )
	private String name;
	
	
	@NotNull
	@Size(min = 3 , max=255, message= "deve conter textos ou palavras com tamanho  3 a 255 caracteres " )
	private String descricao;
	
	@NotNull
	private int quantidade;
	
	@NotNull
    private double preco;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
