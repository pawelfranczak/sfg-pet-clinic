package pl.pfranczak.sfgpetclinic.services.map;

import java.util.Set;

import pl.pfranczak.sfgpetclinic.model.Owner;
import pl.pfranczak.sfgpetclinic.services.CrudService;

public class OwnerMapService extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Owner object) {
		super.delete(object);
	}

	@Override
	public Owner save(Owner object) {
		return super.save(object.getId(), object);
	}



}
