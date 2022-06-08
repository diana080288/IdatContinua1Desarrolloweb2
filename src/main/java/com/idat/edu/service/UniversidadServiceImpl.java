package com.idat.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.idat.edu.model.Universidad;
import com.idat.edu.repository.UniversidadRepository;

@Service
public class UniversidadServiceImpl implements UniversidadService {
	
	@Autowired
	private UniversidadRepository repository;

	@Override
	public void guardarUniversidad(Universidad universidad) {
		// TODO Auto-generated method stub
		repository.save(universidad);

	}

	@Override
	public void actualizarUniversidad(Universidad universidad) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(universidad);

	}

	@Override
	public void eliminarUniversidad(Integer Id) {
		// TODO Auto-generated method stub
		repository.deleteById(Id);

	}

	@Override
	public List<Universidad> listarUniversidad() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Universidad obtenerUniversidadId(Integer Id) {
		// TODO Auto-generated method stub
		return repository.findById(Id).orElse(null);
	}

}
