package com.bc.alumnos.dao;
import java.util.List;
import com.bc.alumnos.entity.*;
public interface IDaoAlumno {

	
		public List<AlumnosBD> findAll();
		public AlumnosBD save(AlumnosBD alumno);
		public AlumnosBD update (AlumnosBD alumno);
		public AlumnosBD findById(int idalumno);
		
	

}
