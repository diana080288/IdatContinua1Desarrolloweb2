package com.idat.edu.service;

import java.util.List;

import com.idat.edu.model.MallaCurricular;


public interface MallaCurricularService {
	
	void guardarMalla(MallaCurricular malla);
	void actualizarMalla(MallaCurricular malla);
	void eliminarMalla(Integer Id);
	List<MallaCurricular> listarMalla();
	MallaCurricular obtenerMallaId(Integer Id);

}
