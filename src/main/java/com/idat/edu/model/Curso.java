package com.idat.edu.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Table(name = "Curso")
@Entity

public class Curso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdCurso;
	private String Curso;
	private String Descripcion;
	
	//relacion de 1 a muchos
	
	@OneToMany(mappedBy = "Curso")
	private List<MallaCurricular> malla = new ArrayList<>();
	
	//relacion de muchos a muchos 
	@ManyToMany(mappedBy = "Curso", 
			cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Profesor> profesor = new ArrayList<>();
	
	
	public Integer getIdCurso() {
		return IdCurso;
	}
	public void setIdCurso(Integer idCurso) {
		IdCurso = idCurso;
	}
	public String getCurso() {
		return Curso;
	}
	public void setCurso(String curso) {
		Curso = curso;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	
	

}
