package org.ayesaTecnologys.DanielRodriguezCea.apirest.services;

import java.util.List;
import java.util.Optional;

import org.ayesaTecnologys.DanielRodriguezCea.apirest.dtos.ClientesSinId;
import org.ayesaTecnologys.DanielRodriguezCea.apirest.modelos.Cliente;
import org.ayesaTecnologys.DanielRodriguezCea.apirest.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<Cliente>getAll(){	
		return clienteRepository.findAll();
	}
	
	public Cliente save(ClientesSinId clientesSin) {
		Cliente cli= new Cliente(
				null, 
				clientesSin.getNombre(),
				clientesSin.getTlf()
				);
		return clienteRepository.save(cli);
	}
	
	public Optional <Cliente> findById(Long id){
		return clienteRepository.findById(id);
	}
	
	public void deleteById(Long id) {
		clienteRepository.deleteById(id);
	}
	
	public Cliente update(Cliente cli) {
		return clienteRepository.save(cli);
	}
}
