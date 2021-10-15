package org.ayesaTecnologys.DanielRodriguezCea.apirest.dtos;

import lombok.Data;

@Data
public class ClientesSinId {
	
	private String nombre;
	private String tlf;
	
	public ClientesSinId(String nombreR, String tlfR) {
		this.nombre=nombreR;
		this.tlf=tlfR;
	}
	public ClientesSinId() {
		this.nombre="";
		this.tlf="";
	}
	
}
