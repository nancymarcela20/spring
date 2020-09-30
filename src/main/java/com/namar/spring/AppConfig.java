package com.namar.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.namar.beans.Barcelona;
import com.namar.beans.Camiseta;
import com.namar.beans.Jugador;
import com.namar.beans.Juventus;
import com.namar.beans.Marca;

@Configuration
public class AppConfig {

	@Bean
	public Jugador jugador1() {
		return new Jugador();
	}
	
	@Bean
	public Barcelona barcelona() {
		return new Barcelona();
	}
	
	@Bean
	public Juventus juventus() {
		return new Juventus();
	}
	
	@Bean
	public Camiseta camiseta() {
		return new Camiseta();
	}
	
	@Bean
	public Marca marca() {
		return new Marca();
	}
}
