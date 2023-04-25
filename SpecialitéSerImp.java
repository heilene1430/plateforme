package tn.enicarthage.services.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import tn.enicarthage.entites.Specialité;
import tn.enicarthage.repositiries.SpecialiteRepo;
import tn.enicarthage.services.SpecialitéService;


@Service
@RequiredArgsConstructor
public class SpecialitéSerImp implements SpecialitéService{

	private final SpecialiteRepo SpecialitéRepository;
	@Override
	public Specialité ajouterSpecialité(Specialité s) {
		SpecialitéRepository.save(s);
        return s;
	}

	@Override
	public Specialité modifierSpecialité(Specialité s) {
		return SpecialitéRepository.save(s);
	}

	@Override
	public void supprimerSpecialité(Long id) {
		SpecialitéRepository.deleteById(id);
		
	}

	@Override
	public List<Specialité> listeSpecialité() {
		List<Specialité> liste= (List<Specialité>) SpecialitéRepository.findAll();
        return(liste);
	}

}
