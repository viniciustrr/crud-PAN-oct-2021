package com.example.demo.model;

import javax.persistence.*;

@Entity
public class ClienteModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	
	private String email;
	
	private String cpfOuCnpj;
	
	private Integer tipo;
	
	//Atenção
	
	public TipoCliente getTipo() {
		return TipoCliente.toEnum(tipo);
	}
	
	
	//Getters and setters
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpfOuCnpj() {
		return cpfOuCnpj;
	}
	public void setCpfOuCnpj(String cpfOuCnpj) {
		this.cpfOuCnpj = cpfOuCnpj;
	}
	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	
	
}
