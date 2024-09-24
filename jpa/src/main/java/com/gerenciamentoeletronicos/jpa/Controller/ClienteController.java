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

import com.gerenciamentoeletronicos.jpa.Entity.Cliente;
import com.gerenciamentoeletronicos.jpa.Service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public List<Cliente> listar(){
		return clienteService.listarClientes();
	}
	
	@PostMapping
	public Cliente salvar (@RequestBody Cliente cliente) {
		return clienteService.salvar(cliente);
	}
	
	@DeleteMapping("/{id}")
	public void deletarCliente(@PathVariable Long id) {
		clienteService.deletarCliente(id);
	}

}
