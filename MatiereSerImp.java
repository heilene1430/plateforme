package tn.enicarthage.services.implementation;

import java.util.List;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import tn.enicarthage.entites.Matiere;
import tn.enicarthage.repositiries.MatiereRepo;
import tn.enicarthage.services.MatiereService;

@Service
@RequiredArgsConstructor
public class MatiereSerImp implements MatiereService{
	private final MatiereRepo MatiereRepository;
    @Override
    public Matiere ajouterMatiere(Matiere m) {
    	MatiereRepository.save(m);
        return m;
    }
	@Override
	public Matiere modifierMatiere(Matiere m) {
		return MatiereRepository.save(m);
	}
	@Override
	public void supprimerMatiere(Long id) {
		MatiereRepository.deleteById(id);
		
	}
	@Override
	public List<Matiere> listeMatiere() {
		 List<Matiere> liste= (List<Matiere>) MatiereRepository.findAll();
	        return(liste);
	}

}
