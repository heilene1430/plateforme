package tn.enicarthage.services;

import java.util.List;

import tn.enicarthage.entites.Etudiant;


public interface EtudiantService {
	public Etudiant ajouterEtudiant(Etudiant e);
    public Etudiant modifierEtudiant(Etudiant e);
    public Etudiant get(long id);
    public Etudiant findByCin(int cin);
    public void supprimerEtudiant(Long id);
    public List<Etudiant> listeEtudiant();

}
