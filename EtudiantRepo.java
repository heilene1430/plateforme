package tn.enicarthage.repositiries;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.enicarthage.entites.Etudiant;

public interface EtudiantRepo extends JpaRepository<Etudiant, Long>{

	public Etudiant findByCin(int cin);

}
