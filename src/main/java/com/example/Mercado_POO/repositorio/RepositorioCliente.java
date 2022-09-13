package com.example.Mercado_POO.repositorio;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Mercado_POO.basica.Cliente;

@Repository
public interface RepositorioCliente extends JpaRepository<Cliente, Long>{

	Cliente findByCpf(String cpf);
	
	Cliente findByNome(String nome);
	
	
}