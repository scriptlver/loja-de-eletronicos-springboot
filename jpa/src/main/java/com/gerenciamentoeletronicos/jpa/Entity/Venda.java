package com.gerenciamentoeletronicos.jpa.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Venda {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    
    @Column(nullable = false)
    private int idCliente;
    
    @Column(nullable = false)
    private String nomeAparelho;
    
    @Column(nullable = false)
    private int idAparelho;
    
    @Column(nullable = false)
    private double valorTotal;
    
    @Column(nullable = false)
    private String dataVenda;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeAparelho() {
        return nomeAparelho;
    }

    public void setNomeAparelho(String nomeAparelho) {
        this.nomeAparelho = nomeAparelho;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getIdAparelho() {
        return idAparelho;
    }

    public void setIdAparelho(int idAparelho) {
        this.idAparelho = idAparelho;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) { 
        this.dataVenda = dataVenda;
    }
}
