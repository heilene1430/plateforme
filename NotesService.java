package tn.enicarthage.services;

import java.util.List;
import tn.enicarthage.entites.notes;



public interface NotesService {
	public notes ajouternotes(notes n);
    public notes modifiernotes(notes n);
    public void supprimernotes(Long id);
    public List<notes> listenotes();
    public List<notes> getNotesByEtudiantId(Long etdId); 
}
