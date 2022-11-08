package br.mobpark.cliente.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="cliente")
public class Cliente {

	@Id
    @GeneratedValue
    private Long id;
    private String nome;
    private Long cpf;
    private String modelo;
    private String placa;
    
    public Cliente() {
        super();
    }

	public Cliente(Long id, String nome, Long cpf, String modelo, String placa) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.modelo = modelo;
		this.placa = placa;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
    
}
