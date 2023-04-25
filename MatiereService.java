package tn.enicarthage.services;

import java.util.List;

import tn.enicarthage.entites.Matiere;


public interface MatiereService {

	public Matiere ajouterMatiere(Matiere m);
    public Matiere modifierMatiere(Matiere m);
    public void supprimerMatiere(Long id);
    public List<Matiere> listeMatiere();
}
