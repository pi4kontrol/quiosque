package br.senac.service.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.senac.model.Veiculo;
import br.senac.service.VeiculoService;

public class VeiculoServiceImpl implements VeiculoService{
	
	@PersistenceContext
	private EntityManager em;
	
	public void cadastrar(Veiculo veiculo) {
		
		em.persist(veiculo);
		
	}

}
