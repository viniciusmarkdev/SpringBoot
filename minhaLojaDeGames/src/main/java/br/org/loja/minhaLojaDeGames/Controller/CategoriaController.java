package br.org.loja.minhaLojaDeGames.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.loja.minhaLojaDeGames.Model.Categoria;
import br.org.loja.minhaLojaDeGames.Repository.CategoriaRepository;

@RestController
@RequestMapping("/categoria")// Aqui é onde é pasado o end-point  para obter os métodos desse controller
@CrossOrigin(origins= "*" , allowedHeaders = "*")
public class CategoriaController {
	
	
	
	@Autowired
	private  CategoriaRepository categoriaRepository;
	
		
	@GetMapping
	public  ResponseEntity< List< Categoria > >  getAll (){
		return  ResponseEntity . ok(categoriaRepository. findAll()); 
	}
	
   @GetMapping("/{id}")
   public  ResponseEntity< Categoria >  getById ( @PathVariable  long  id ) {
		return  categoriaRepository. findById(id)
			.map(resp ->  ResponseEntity . ok(resp))
			.orElse( ResponseEntity . notFound() . build());
	}
   @GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<Categoria>> getByTitulo(@PathVariable String titulo){
		return ResponseEntity.ok(categoriaRepository.findAllByTituloContainingIgnoreCase(titulo));
	}

   @PostMapping
  	    public ResponseEntity<Categoria> post (@RequestBody Categoria categoria){
  	    	return ResponseEntity.status(HttpStatus.CREATED).body(categoriaRepository.save(categoria));
  	    	
  	}
  	    
  	    @PutMapping
  	    public ResponseEntity<Categoria> put (@RequestBody Categoria categoria){
  	    	return ResponseEntity.status(HttpStatus.OK).body(categoriaRepository.save(categoria));
  	    	
  	}
  	    @DeleteMapping("/{id}")
  	    public void delete(@PathVariable long id) {
  	    	categoriaRepository.deleteById(id);
  	    }
  	}			
