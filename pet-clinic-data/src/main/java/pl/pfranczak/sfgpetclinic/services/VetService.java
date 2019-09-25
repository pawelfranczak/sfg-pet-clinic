package pl.pfranczak.sfgpetclinic.services;

import pl.pfranczak.sfgpetclinic.model.Vet;

public interface VetService extends CrudService<Vet, Long> {
	
	Vet findByLastName(String lastName);
	
}
