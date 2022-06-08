package com.idat.edu.service;

import java.util.List;


import com.idat.edu.model.Profesor;

public interface ProfesorService {
	
	void guardarProfesor(Profesor profesor);
	void actualizarProfesor(Profesor profesor);
	void eliminarProfesor(Integer Id);
	List<Profesor> listarProfesor();
	Profesor obtenerProfesorId(Integer Id);

}
