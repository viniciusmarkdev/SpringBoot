package br.org.loja.minhaLojaDeGames.Model;

	
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity //define a classe como uma entide de banco de dados, ou seja 
//,aqui será gerado as linhas com os devidos atributos do banco de dados de forma abstrata
@Table(name = "tb_categorias")
public class Categoria {
	
	@ManyToOne
	@JsonIgnoreProperties ( " categoria" )
    private Produto produto;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)//A estratégia de criação é auto-increment 
	//, o Hibernate utiliza esse tipo para MYSQL
	//Aqui , com essas duas anotações, gerarmos a chave Primária @id  nas colunas da tabela e colocamos o auto-incremento nela
	private long id;
	
	@NotNull
	@Size(min =4 , max  =255 , message ="Este atributo deve ter entre 4 a 255 caractéres")
	private String genêro;
	
	@NotNull
	private int faixaEtária ;
	
	@NotNull
	@Size(min =4 , max  =255 , message ="Este atributo deve ter entre 4 a 255 caractéres")
	private String titulo ;
	
	
	@NotNull
	private boolean Multijogador;
	
	@Size(min =4 , max  =255 , message ="Este atributo deve ter entre 4 a 255 caractéres")
	private String console;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getGenêro() {
		return genêro;
	}

	public void setGenêro(String genêro) {
		this.genêro = genêro;
	}

	public int getFaixaEtária() {
		return faixaEtária;
	}

	public void setFaixaEtária(int faixaEtária) {
		this.faixaEtária = faixaEtária;
	}

	public boolean isMultijogador() {
		return Multijogador;
	}

	public void setMultijogador(boolean multijogador) {
		Multijogador = multijogador;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	
	
    

	

}
