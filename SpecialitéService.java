package tn.enicarthage.services;

import java.util.List;

import tn.enicarthage.entites.Specialité;



public interface SpecialitéService {
	public Specialité ajouterSpecialité(Specialité s);
    public Specialité modifierSpecialité(Specialité s);
    public void supprimerSpecialité(Long id);
    public List<Specialité> listeSpecialité();

}
