package com.namar.beans;

import org.springframework.stereotype.Component;

import com.namar.interfaces.IEquipo;

//@Component
public class Juventus implements IEquipo{

	public String mostrar() {
		return "Juventus";
	}

}
