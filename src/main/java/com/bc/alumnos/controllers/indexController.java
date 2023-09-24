package com.bc.alumnos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bc.alumnos.dao.IDaoAlumno;
import com.bc.alumnos.entity.*;
import com.google.gson.Gson;

import java.util.List;
@RestController
@RequestMapping(value = "/api")
public class indexController {
	@Autowired
	private IDaoAlumno dato;
	
	
	@GetMapping(value = "/getAlumnos", produces = MediaType.APPLICATION_JSON_VALUE)
	public String getAlumnos() {
		List<AlumnosBD> lista = dato.findAll();
		
		Gson gson = new Gson();
		return gson.toJson(lista);
	}
	
}
