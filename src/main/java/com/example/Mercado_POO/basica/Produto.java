package com.example.Mercado_POO.basica;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.Mercado_POO.excecoes.QuantidadeNegativaException;


@Entity
public class Produto{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String categoria;
	private Double valorCompra;
	private Double valorVenda;
	private Integer quantidade;
	private String validade;
	
	public Produto(String nome, String categoria, Double valorCompra, Double valorVenda, int quantidade,
			String validade) {
		super();
		this.nome = nome;
		this.categoria = categoria;
		this.valorCompra = valorCompra;
		this.valorVenda = valorVenda;
		this.quantidade = quantidade;
		this.validade = validade;
	}
	
	public Produto(long id, String nome, String categoria, Double valorCompra, Double valorVenda,
			Integer quantidade, String validade) {
		super();
		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
		this.valorCompra = valorCompra;
		this.valorVenda = valorVenda;
		this.quantidade = quantidade;
		this.validade = validade;
	}

	public Produto() {
		super();
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Double getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(Double valorCompra) {
		this.valorCompra = valorCompra;
	}
	public Double getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(Double valorVenda) {
		this.valorVenda = valorVenda;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getId() {
		return id;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(categoria, id, nome, quantidade, validade, valorCompra, valorVenda);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(nome, other.nome);
	}
	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", categoria=" + categoria + ", valorCompra=" + valorCompra
				+ ", valorVenda=" + valorVenda + ", quantidade=" + quantidade + ", validade=" + validade + "]";
	}	
}
