package com.gerenciamentoeletronicos.jpa.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gerenciamentoeletronicos.jpa.Entity.Aparelho;
import com.gerenciamentoeletronicos.jpa.Service.AparelhoService;

@RestController
@RequestMapping("/aparelhos")
public class AparelhoController {
	
	@Autowired
	private AparelhoService aparelhoService;
	
	@GetMapping
	public List<Aparelho> listar(){
		return aparelhoService.listarAparelhos();
	}
	
	@PostMapping
	public Aparelho salvar(@RequestBody Aparelho aparelho) {
		return aparelhoService.salvar(aparelho);
		
	}
	
	@DeleteMapping("/{id}")
	public void deletarAparelho(@PathVariable Long id) {
		aparelhoService.deletarAparelho(id);
	}
	

}
