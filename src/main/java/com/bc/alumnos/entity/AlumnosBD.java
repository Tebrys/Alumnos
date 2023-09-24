package com.bc.alumnos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Table(name = "alumno")
@Entity
@Data
public class AlumnosBD {
	
	@Id 
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	@Column (name = "id_alumno")
	private int id_alumno;
	@Column (name = "nombre")
	private String nombre;
	
	
	

}
