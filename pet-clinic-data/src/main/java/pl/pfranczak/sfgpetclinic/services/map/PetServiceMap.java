package pl.pfranczak.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import pl.pfranczak.sfgpetclinic.model.Pet;
import pl.pfranczak.sfgpetclinic.services.PetService;

@Service
public class PetServiceMap extends AbstractServiceMap<Pet, Long> implements PetService {

	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}

	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Pet object) {
		super.delete(object);
	}

	@Override
	public Pet save(Pet object) {
		return super.save(object);
	}

}
