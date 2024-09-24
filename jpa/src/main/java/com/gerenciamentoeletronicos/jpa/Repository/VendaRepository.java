package com.gerenciamentoeletronicos.jpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gerenciamentoeletronicos.jpa.Entity.Venda;

@Repository
public interface VendaRepository extends JpaRepository <Venda, Long>{

}
