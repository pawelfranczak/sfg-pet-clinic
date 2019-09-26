package pl.pfranczak.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import pl.pfranczak.sfgpetclinic.model.Owner;
import pl.pfranczak.sfgpetclinic.services.OwnerService;

@Service
public class OwnerServiceMap extends AbstractServiceMap<Owner, Long> implements OwnerService {

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

	@Override
	public Owner findByLastName(String lastName) {
		return null;
	}

}