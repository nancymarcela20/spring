package com.namar.beans;

import org.springframework.stereotype.Component;

import com.namar.interfaces.IEquipo;

@Component
public class Barcelona implements IEquipo{
    
	public String mostrar() {
		return "Barcelona FC";
	}

	
	
}
