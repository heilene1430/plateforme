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
import tn.enicarthage.entites.Specialité;
import lombok.RequiredArgsConstructor;
import tn.enicarthage.services.implementation.SpecialitéSerImp;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/Specialité")

public class Specialitecontroller {
	private final SpecialitéSerImp SpecialitéService;
	
	
	@GetMapping("/getSpecialité")
    public List<Specialité> getSpecialité(){
        List<Specialité> Specialité=SpecialitéService.listeSpecialité();
        return(Specialité);}
	
	@PostMapping("/ajouterSpecialité")
    public ResponseEntity<Specialité> ajouterSpecialité(@RequestBody Specialité Specialité){
		Specialité newSpecialité = SpecialitéService.ajouterSpecialité(Specialité);
        return new ResponseEntity<>(newSpecialité, HttpStatus.CREATED);
    }
	@PutMapping("/modifierSpecialité")
    public ResponseEntity<Specialité> modifierSpecialité(@RequestBody Specialité Specialité){
		Specialité updatedSpecialité = SpecialitéService.modifierSpecialité(Specialité);
        return new ResponseEntity<>(updatedSpecialité, HttpStatus.OK);
    }
	@DeleteMapping("/supprimerSpecialité/{id}")
    public ResponseEntity<?> supprimerSpecialité(@PathVariable(value = "id", required = true) Long id){
        System.out.println("test test");
        SpecialitéService.supprimerSpecialité(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
	
}
