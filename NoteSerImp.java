package tn.enicarthage.services.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import tn.enicarthage.entites.Etudiant;
import tn.enicarthage.entites.notes;
import tn.enicarthage.repositiries.NoteRepo;
import tn.enicarthage.services.NotesService;

@Service
@RequiredArgsConstructor
public class NoteSerImp implements NotesService{

	private final NoteRepo NotesRepository;
	
	@Override
	public notes ajouternotes(notes n) {
		NotesRepository.save(n);
        return n;
	}

	@Override
	public notes modifiernotes(notes n) {
	  return NotesRepository.save(n);
	}

	@Override
	public void supprimernotes(Long id) {
		NotesRepository.deleteById(id);
		
	}

	@Override
	public List<notes> listenotes() {
		List<notes> liste= (List<notes>) NotesRepository.findAll();
        return(liste);
	}

	
	 public List<notes> getNotesByEtudiantId(Long etdId) {
	        return NotesRepository.findByEtdId(etdId);
	    }

	
}
