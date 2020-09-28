package com.namar.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Ciudad {
	
	private String nombre;
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/*
	 * @PostConstruct private void initBean() {
	 * System.out.println("Antes de inicializar el bean2"); }
	 * 
	 * @PreDestroy private void destroyBean() {
	 * System.out.println("Bean a punto de ser destruido 2"); }
	 */
		
}
