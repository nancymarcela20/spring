package com.namar.spring;

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
		// TODO Auto-generated method stub

		//ApplicationContext appContext = new ClassPathXmlApplicationContext("com/namar/xml/beans.xml");
		
		/*
		 * AnnotationConfigApplicationContext appContext = new
		 * AnnotationConfigApplicationContext(); appContext.register(AppConfig.class);
		 * appContext.register(AppConfig2.class); appContext.refresh();
		 * 
		 * Mundo m = (Mundo) appContext.getBean("marte");
		 * 
		 * System.out.println(m.getSaludo());
		 * 
		 * ((ConfigurableApplicationContext)appContext).close();
		 */
		
		/* Inyeccion por constructor
		 * ApplicationContext appContext = new
		 * ClassPathXmlApplicationContext("com/namar/xml/beans.xml"); Persona per =
		 * (Persona) appContext.getBean("persona");
		 * 
		 * System.out.println(per.getId()+" "+per.getNombre()+" "+per.getApodo());
		 * 
		 * ((ConfigurableApplicationContext)appContext).close();
		 */
		
		 
		  ApplicationContext appContext = new ClassPathXmlApplicationContext("com/namar/xml/beans.xml"); 
		  //Jugador jug = (Jugador) appContext.getBean("messi");
		  //IEquipo bar = (IEquipo) appContext.getBean("barcelona");
		  //System.out.println(jug.getNombre()+"-"+jug.getEquipo().mostrar());		  
		  
		  Jugador jug = (Jugador) appContext.getBean("messi");
		  
		  System.out.println(jug.getNombre()+"-"+jug.getEquipo().mostrar());
		  ((ConfigurableApplicationContext)appContext).close();
		 
	}

}
