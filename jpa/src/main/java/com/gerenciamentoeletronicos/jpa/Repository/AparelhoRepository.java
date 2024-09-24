package com.gerenciamentoeletronicos.jpa.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gerenciamentoeletronicos.jpa.Entity.Aparelho;

@Repository
public interface AparelhoRepository extends JpaRepository <Aparelho, Long> {

	List<Aparelho> findAll();

}
