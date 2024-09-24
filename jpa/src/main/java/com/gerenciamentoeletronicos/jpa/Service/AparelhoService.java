package com.gerenciamentoeletronicos.jpa.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerenciamentoeletronicos.jpa.Entity.Aparelho;
import com.gerenciamentoeletronicos.jpa.Repository.AparelhoRepository;

@Service
public class AparelhoService {
	
	@Autowired
	private AparelhoRepository aparelhoRepository;
	
	public List<Aparelho> listarAparelhos(){
		return aparelhoRepository.findAll();
	}
	
	public Aparelho salvar (Aparelho aparelho) {
		return aparelhoRepository.save(aparelho);
	}
	
	public void deletarAparelho(Long id) {
		aparelhoRepository.deleteById(id);
	}
	

}
