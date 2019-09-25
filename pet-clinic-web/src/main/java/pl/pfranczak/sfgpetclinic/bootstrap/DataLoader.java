package pl.pfranczak.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import pl.pfranczak.sfgpetclinic.model.Owner;
import pl.pfranczak.sfgpetclinic.model.Vet;
import pl.pfranczak.sfgpetclinic.services.OwnerService;
import pl.pfranczak.sfgpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner{
	
	private final OwnerService ownerService;
	private final VetService vetService;

	//This will be autowired by spring
	public DataLoader(OwnerService ownerService, VetService vetService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
	}

	@Override
	public void run(String... args) throws Exception {

		Owner owner1 = new Owner();
		owner1.setId(1L);
		owner1.setFirstName("Michal");
		owner1.setLastName("Weston");
		ownerService.save(owner1);

		Owner owner2 = new Owner();
		owner2.setId(2L);
		owner2.setFirstName("Fiona");
		owner2.setLastName("Grendzer");
		ownerService.save(owner2);
		
		System.out.println("Loaded Owners....");
		
		Vet vet1 = new Vet();
		vet1.setId(1L);
		vet1.setFirstName("SAM");
		vet1.setLastName("AXE");
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet1.setId(2L);
		vet1.setFirstName("Pawel");
		vet1.setLastName("Porter");
		vetService.save(vet2);
		
		System.out.println("Loaded Vets....");
	
	}

}
