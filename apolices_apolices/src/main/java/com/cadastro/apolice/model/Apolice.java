package com.cadastro.apolice.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Table
@Entity
public class Apolice implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idApolice;
	private Integer sucursal;
	private Integer ramo;
	private Integer numApolice;
	private Integer ciaSeguradora;
	private Integer item;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="segurado_id")
	private Segurado segurado;
	
	public Apolice(Integer idApolice, Integer sucursal, Integer ramo, Integer numApolice, Integer ciaSeguradora,
			Integer item, Segurado segurado) {
		super();
		this.idApolice = idApolice;
		this.sucursal = sucursal;
		this.ramo = ramo;
		this.numApolice = numApolice;
		this.ciaSeguradora = ciaSeguradora;
		this.item = item;
		this.segurado = segurado;
	}
	
	public Apolice() {
		super();
	}
	@Override
	public String toString() {
		return "Apolice [idApolice=" + idApolice + ", sucursal=" + sucursal + ", ramo=" + ramo + ", ciaSeguradora="
				+ ciaSeguradora + ", item=" + item + "]";
	}
	public Integer getIdApolice() {
		return idApolice;
	}
	public void setIdApolice(Integer idApolice) {
		this.idApolice = idApolice;
	}
	public Integer getSucursal() {
		return sucursal;
	}
	public void setSucursal(Integer sucursal) {
		this.sucursal = sucursal;
	}
	public Integer getRamo() {
		return ramo;
	}
	public void setRamo(Integer ramo) {
		this.ramo = ramo;
	}
	public Integer getCiaSeguradora() {
		return ciaSeguradora;
	}
	public void setCiaSeguradora(Integer ciaSeguradora) {
		this.ciaSeguradora = ciaSeguradora;
	}
	public Integer getItem() {
		return item;
	}
	public void setItem(Integer item) {
		this.item = item;
	}
	public Integer getNumApolice() {
		return numApolice;
	}
	public void setNumApolice(Integer numApolice) {
		this.numApolice = numApolice;
	}
	public Segurado getSegurado() {
		return segurado;
	}
	public void setSegurado(Segurado segurado) {
		this.segurado = segurado;
	}
	
}
