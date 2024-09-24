package com.gerenciamentoeletronicos.jpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gerenciamentoeletronicos.jpa.Entity.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Long> {


}
