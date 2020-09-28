package com.namar.beans;

import javax.annotation.*;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Persona implements InitializingBean, DisposableBean{
	
	private int id;
	private String nombre;
	private String apodo;
	private Pais pais;
	private Ciudad ciudad;
		
	/* Inyeccion por constructor
	 * public Persona(int id, String nombre, String apodo) { this.id = id;
	 * this.nombre = nombre; this.apodo = apodo; }
	 * 
	 * public Persona(int id) { this.id = id; }
	 * 
	 * public Persona(String apodo) { this.apodo = apodo; }
	 */
	
	/*
	 * @PostConstruct private void initBean() {
	 * System.out.println("Antes de inicializar el bean"); }
	 * 
	 * @PreDestroy private void destroyBean() {
	 * System.out.println("Bean a punto de ser destruido"); }
	 */
	
	public Ciudad getCiudad() {
		return ciudad;
	}
	
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}
	
	public Pais getPais() {
		return pais;
	}
	
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApodo() {
		return apodo;
	}
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		//System.out.println("Antes de inicializar el bean");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		//System.out.println("Bean a punto de ser destruido");
	}
				
}
