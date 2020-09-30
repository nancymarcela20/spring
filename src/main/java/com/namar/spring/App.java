package com.namar.spring;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.namar.beans.Barcelona;
import com.namar.beans.Ciudad;
import com.namar.beans.Jugador;
import com.namar.beans.Juventus;
import com.namar.beans.Persona;
import com.namar.interfaces.IEquipo;

//import com.namar.beans.AppConfig;
//import com.namar.beans.AppConfig2;
//import com.namar.beans.Mundo;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Elija un equipo: 1-Barcelona 2- Juventus");
		int respuesta = sc.nextInt();
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/namar/xml/beans.xml");
		Jugador jug = (Jugador) appContext.getBean("jugador1");
		
		switch(respuesta) {
		 case 1:
		      jug.setEquipo(new Barcelona());
		      break;
		 case 2:
		      jug.setEquipo(new Juventus());
		      break;
		 default:		      
		      break;
		}
		
		System.out.println(jug.getNombre() + "-" + jug.getEquipo().mostrar()+"-"+ jug.getCamiseta().getNumero()+"-"+ jug.getCamiseta().getMarca().getNombre());
		((ConfigurableApplicationContext) appContext).close();

	}

}
