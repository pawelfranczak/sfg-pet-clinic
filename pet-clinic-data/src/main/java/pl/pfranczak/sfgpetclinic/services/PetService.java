package pl.pfranczak.sfgpetclinic.services;

import java.util.Set;

import pl.pfranczak.sfgpetclinic.model.Pet;

public interface PetService {

	Pet findById(Long id);
	
	Pet save(Pet Pet);
	
	Set<Pet> findAll();
	
}
