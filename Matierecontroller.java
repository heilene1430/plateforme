package tn.enicarthage.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import tn.enicarthage.entites.Matiere;
import tn.enicarthage.services.implementation.MatiereSerImp;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/Matiere")


public class Matierecontroller {
	private final MatiereSerImp MatiereService;
	
	@GetMapping("/getMatiere")
    public List<Matiere> getMatiere(){
        List<Matiere> Matiere=MatiereService.listeMatiere();
        return(Matiere);}
	
	@PostMapping("/ajouterMatiere")
    public ResponseEntity<Matiere> ajouterMatiere(@RequestBody Matiere Matiere){
		Matiere newMatiere = MatiereService.ajouterMatiere(Matiere);
        return new ResponseEntity<>(newMatiere, HttpStatus.CREATED);}
	
	
	
	@PutMapping("/modifierMatiere")
    public ResponseEntity<Matiere> modifierMatiere(@RequestBody Matiere Matiere){
		Matiere updatedMatiere = MatiereService.modifierMatiere(Matiere);
        return new ResponseEntity<>(updatedMatiere, HttpStatus.OK);
    }
	
	
	@DeleteMapping("/supprimerMatiere/{id}")
    public ResponseEntity<?> supprimerMatiere(@PathVariable(value = "id", required = true) Long id){
        System.out.println("test test");
        MatiereService.supprimerMatiere(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

	
	

}
