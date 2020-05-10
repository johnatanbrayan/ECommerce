package br.com.johnatanbrayan.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.johnatanbrayan.domain.Categoria;
import br.com.johnatanbrayan.repository.CategoriaRepository;
import br.com.johnatanbrayan.service.exception.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria find(Long id) {
		Optional<Categoria> obj = categoriaRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: "+id+" ,Tipo: "+Categoria.class.getName()));
	}
}