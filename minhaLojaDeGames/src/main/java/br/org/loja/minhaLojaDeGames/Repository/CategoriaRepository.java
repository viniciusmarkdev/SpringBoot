package br.org.loja.minhaLojaDeGames.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import br.org.loja.minhaLojaDeGames.Model.Categoria;


@Repository//A classe CategoriaRepository  recebe todos os métodos da interface JpaRepository 
//para poder fazer alterações no Banco de dados
public interface CategoriaRepository  extends JpaRepository< Categoria, Long>{
	
	
	
	public List<Categoria>findAllByTituloContainingIgnoreCase(String titulo);

	
	

}
