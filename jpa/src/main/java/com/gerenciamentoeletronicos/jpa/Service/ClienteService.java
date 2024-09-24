package com.gerenciamentoeletronicos.jpa.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerenciamentoeletronicos.jpa.Entity.Cliente;
import com.gerenciamentoeletronicos.jpa.Repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<Cliente> listarClientes(){
		return clienteRepository.findAll();
	}
	
	public Cliente salvar(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public void deletarCliente(Long id) {
		clienteRepository.deleteById(id);
	}

}
