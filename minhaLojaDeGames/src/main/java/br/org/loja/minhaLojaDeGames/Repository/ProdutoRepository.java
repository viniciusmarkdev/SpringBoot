package br.org.loja.minhaLojaDeGames.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.loja.minhaLojaDeGames.Model.Produto;

@Repository
public interface ProdutoRepository  extends JpaRepository< Produto, Long>{
		
		
		
		public List<Produto>findAllByDescricaoContainingIgnoreCase(String descricão);

		
		

	}


