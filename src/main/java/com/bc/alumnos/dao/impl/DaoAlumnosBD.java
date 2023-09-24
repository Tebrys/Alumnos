package com.bc.alumnos.dao.impl;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bc.alumnos.dao.IDaoAlumno;
import com.bc.alumnos.entity.AlumnosBD;

import lombok.extern.slf4j.Slf4j;

@Repository
@Transactional
@Slf4j
public class DaoAlumnosBD  implements IDaoAlumno{
@PersistenceContext
private EntityManager em ;
	@Override
	public List<AlumnosBD> findAll() {
		
		
		try {
			@SuppressWarnings("unchecked")
			List<AlumnosBD> listaAlumnos = em.createQuery("from AlumnosBD").getResultList();
			return listaAlumnos;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}

	@Override
	public AlumnosBD save(AlumnosBD alumno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AlumnosBD update(AlumnosBD alumno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AlumnosBD findById(int idalumno) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	

}
