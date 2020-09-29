package com.namar.beans;

import org.springframework.stereotype.Service;

import com.namar.interfaces.IEquipo;

@Service
public class Barcelona implements IEquipo{
    
	public String mostrar() {
		return "Barcelona FC";
	}

	
	
}
