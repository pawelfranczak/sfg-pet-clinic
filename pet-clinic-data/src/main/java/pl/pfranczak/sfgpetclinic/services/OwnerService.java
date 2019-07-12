package pl.pfranczak.sfgpetclinic.services;

import java.util.Set;

import pl.pfranczak.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

	Owner findByLastName(String lastName);
	
}
