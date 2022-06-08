package com.idat.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.edu.model.Curso;
import com.idat.edu.repository.CursoRepository;

@Service
public class CursoServiceImpl implements CursoService {
	
	@Autowired
	private CursoRepository repository;

	@Override
	public void guardarCurso(Curso curso) {
		// TODO Auto-generated method stub
		repository.save(curso);

	}

	@Override
	public void actualizarCurso(Curso curso) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(curso);

	}

	@Override
	public void eliminarCurso(Integer Id) {
		// TODO Auto-generated method stub
		repository.deleteById(Id);

	}

	@Override
	public List<Curso> listarCurso() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Curso obtenerCursoId(Integer Id) {
		// TODO Auto-generated method stub
		return repository.findById(Id).orElse(null);
	}

}
