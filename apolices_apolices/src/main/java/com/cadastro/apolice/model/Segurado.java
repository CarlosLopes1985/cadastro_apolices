package com.cadastro.apolice.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table
@Entity
public class Segurado implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idSegurado;
	private String nome;
	private String cpf;
	private String telefone;
	
	@OneToMany(mappedBy="segurado", cascade=CascadeType.ALL)
	private List<Apolice>apolices = new ArrayList<Apolice>();
	
	public Segurado() {
		super();
	}

	public Segurado(Integer idSegurado, String nome, String cpf, String telefone) {
		super();
		this.idSegurado = idSegurado;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Segurado [idSegurado=" + idSegurado + ", nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone
				+ "]";
	}

	public Integer getIdSegurado() {
		return idSegurado;
	}

	public void setIdSegurado(Integer idSegurado) {
		this.idSegurado = idSegurado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public List<Apolice> getApolices() {
		return apolices;
	}

	public void setApolices(List<Apolice> apolices) {
		this.apolices = apolices;
	}
	
	
}
