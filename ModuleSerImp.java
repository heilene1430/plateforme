package tn.enicarthage.services.implementation;

import java.util.List;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import tn.enicarthage.repositiries.ModuleRepo;
import tn.enicarthage.services.ModuleService;
import tn.enicarthage.entites.Module;


	@Service
	@RequiredArgsConstructor
	public class ModuleSerImp implements ModuleService {

	    private final ModuleRepo ModuleRepository;
	    @Override
	    public Module ajouterModule(Module m) {
	    	ModuleRepository.save(m);
	        return m;
	    }

	    @Override
	    public Module modifierModule(Module m) {
	        return ModuleRepository.save(m);

	    }

	    @Override
	    public void supprimerModule(Long id) {
	    	ModuleRepository.deleteById(id);
	    }

	    @Override
	    public List<Module> listeModule() {
	    	 List<Module> liste= (List<Module>) ModuleRepository.findAll();
	        return(liste);
	    }

	

}
