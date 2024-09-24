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

import com.gerenciamentoeletronicos.jpa.Entity.Venda;
import com.gerenciamentoeletronicos.jpa.Service.VendaService;

@RestController
@RequestMapping("/vendas")
public class VendaController {
	
	@Autowired
	private VendaService vendaService;
	
	@GetMapping
	public List<Venda> listar(){
		return vendaService.listarVendas();
	}
	
	@PostMapping
	public Venda salvar (@RequestBody Venda venda ) {
		return vendaService.salvar(venda);
	}
	
	@DeleteMapping("/{id}")
	public void deletarVenda(@PathVariable Long id) {
		vendaService.deletarVenda(id);
	}
	
	

}
