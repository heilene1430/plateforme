package tn.enicarthage.services.implementation;

import java.util.List;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import tn.enicarthage.entites.Etudiant;
import tn.enicarthage.repositiries.EtudiantRepo;
import tn.enicarthage.services.EtudiantService;


@Log4j
@Service
@RequiredArgsConstructor
public class EtudiantSerImp implements EtudiantService {
	

    private final EtudiantRepo EtudiantRepository;
    @Override
    public Etudiant ajouterEtudiant(Etudiant e) {
    	log.info("ajout d'un etudiant de cin :{}"+ e.getCin());
    	EtudiantRepository.save(e);
        return e;
    }

    @Override
    public Etudiant modifierEtudiant(Etudiant e) {
    	log.info("modification d'un etudiant de cin :{}"+ e.getCin());
        return EtudiantRepository.save(e);

    }

    @Override
    public void supprimerEtudiant(Long id) {
    	log.info("suppression d'un etudiant  :{}");
    	EtudiantRepository.deleteById(id);
    }

    @Override
    public List<Etudiant> listeEtudiant() {
    	log.info("lister la liste des etudiant  :{}");
        List<Etudiant> liste= (List<Etudiant>) EtudiantRepository.findAll();
        return(liste);
    }

	@Override
	public Etudiant get(long id) {
		
		return EtudiantRepository.findById(id).get();
	}

	
	public Etudiant findByCin(int cin) {
		return EtudiantRepository.findByCin(cin);
	}
}
