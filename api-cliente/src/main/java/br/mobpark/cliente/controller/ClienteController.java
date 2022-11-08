package br.mobpark.cliente.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.mobpark.cliente.model.Cliente;
import br.mobpark.cliente.services.ClienteService;

@RestController 
@RequestMapping ("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public ResponseEntity <Iterable<Cliente>> getCliente(){
		return ResponseEntity.ok().body (clienteService.getClientes());
	}
	
	@GetMapping("/cliente/{id}")
	public ResponseEntity <Cliente> getCliente(@PathVariable Long id ){
		return ResponseEntity.ok().body (clienteService.getCliente(id));
	}
	
	@PostMapping
	public ResponseEntity <Void> adicionarCliente(@RequestBody Cliente cliente){
		clienteService.createCliente(cliente);
		return new ResponseEntity <Void> (HttpStatus.CREATED);
	}
	
	
	@PutMapping
	public ResponseEntity <Void> atualizarCliente (@RequestBody Cliente cliente) {
		clienteService.updateCliente (cliente);
		return new ResponseEntity <Void> (HttpStatus.OK);
	}
	
	@DeleteMapping ("/cliente")
	public ResponseEntity <Void> deletarCliente (@PathVariable Long id){
		var cliente = clienteService.getCliente (id);
		clienteService.deleteCliente(cliente);
		return new ResponseEntity <Void> (HttpStatus.NO_CONTENT);
	}
	
	
}
