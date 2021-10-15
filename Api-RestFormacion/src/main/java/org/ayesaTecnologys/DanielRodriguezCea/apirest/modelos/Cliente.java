package org.ayesaTecnologys.DanielRodriguezCea.apirest.modelos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Cliente")
public class Cliente implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1299569035590254332L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Long id;

	private String nombre;
	
	private String tlf;
	
	public Cliente(Long id, String nombre, String tlf) {
		this.id=id;
		this.nombre=nombre;
		this.tlf=tlf;
	}
	public Cliente() {
		this.id=0L;
		this.nombre="";
		this.tlf="";
	}
	
}
