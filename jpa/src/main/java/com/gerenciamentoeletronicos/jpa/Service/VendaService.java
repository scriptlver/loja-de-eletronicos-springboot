package com.gerenciamentoeletronicos.jpa.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerenciamentoeletronicos.jpa.Entity.Venda;
import com.gerenciamentoeletronicos.jpa.Repository.VendaRepository;

@Service
public class VendaService {
	
	@Autowired
	private VendaRepository vendaRepository;
	
	public List<Venda> listarVendas(){
		return vendaRepository.findAll();
		
	}
	
	public Venda salvar (Venda venda) {
		return vendaRepository.save(venda);
	}
	
	public void deletarVenda(Long id) {
		vendaRepository.deleteById(id);
	}


}
