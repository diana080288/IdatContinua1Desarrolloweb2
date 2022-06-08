package com.idat.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.edu.model.MallaCurricular;
import com.idat.edu.repository.MallaCurricularRepository;

@Service
public class MallaCurricularServiceImpl implements MallaCurricularService {
	
	@Autowired
	private MallaCurricularRepository repository;

	@Override
	public void guardarMalla(MallaCurricular malla) {
		// TODO Auto-generated method stub
		repository.save(malla);

	}

	@Override
	public void actualizarMalla(MallaCurricular malla) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(malla);

	}

	@Override
	public void eliminarMalla(Integer Id) {
		// TODO Auto-generated method stub
		repository.deleteById(Id);

	}

	@Override
	public List<MallaCurricular> listarMalla() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public MallaCurricular obtenerMallaId(Integer Id) {
		// TODO Auto-generated method stub
		return repository.findById(Id).orElse(null);
	}

}
