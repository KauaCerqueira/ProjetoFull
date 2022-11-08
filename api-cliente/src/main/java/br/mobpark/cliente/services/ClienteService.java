package br.mobpark.cliente.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.mobpark.cliente.model.Cliente;
import br.mobpark.cliente.respository.ClienteRepository;


@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;
	
	public Iterable <Cliente> getClientes(){
		return repository.findAll();
	}
	
	public void createCliente (Cliente cliente) {
		  repository.save(cliente);
	}
	
	public Cliente getCliente (Long id) {
		return repository.findById(id).orElse(null);
	}
	
	public void updateCliente (Cliente cliente) {
		repository.save(cliente);
	}
	
	public void deleteCliente (Cliente cliente) {
		repository.delete(cliente);
	}
}
