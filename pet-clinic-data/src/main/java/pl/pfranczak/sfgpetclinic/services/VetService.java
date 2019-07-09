package pl.pfranczak.sfgpetclinic.services;

import java.util.Set;

import pl.pfranczak.sfgpetclinic.model.Vet;

public interface VetService {

	Vet findById(Long id);
	
	Vet save(Vet Vet);
	
	Set<Vet> findAll();
	
}
