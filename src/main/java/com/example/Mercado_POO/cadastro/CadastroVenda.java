package com.example.Mercado_POO.cadastro;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Mercado_POO.basica.Venda;
import com.example.Mercado_POO.repositorio.RepositorioVenda;

@Service
public class CadastroVenda {
	
	@Autowired
	private RepositorioVenda repositorioVenda;
	
	public Venda saveVenda(Venda venda) {
		return repositorioVenda.save(venda);
	}	
	
	public List<Venda> listAll(){
		return repositorioVenda.findAll();
	}
	
	public Optional<Venda> findById(Long id) {
		return repositorioVenda.findById(id);
	}
	
	public Optional<Venda> findByClienteVendaId(Long fornecedorId){
		return repositorioVenda.findByClienteVendaId(fornecedorId);
	}
	
	public Optional<Venda> findByVendedorVendaId(Long fornecedorId){
		return repositorioVenda.findByVendedorVendaId(fornecedorId);
	}
	
	public void deleteById(Long id) {
		repositorioVenda.deleteById(id);
	}
	
	public void delete(Venda venda) {
		repositorioVenda.delete(venda);
	}
}
