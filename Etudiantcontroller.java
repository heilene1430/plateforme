package tn.enicarthage.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tn.enicarthage.entites.Etudiant;
import lombok.RequiredArgsConstructor;
import tn.enicarthage.services.implementation.EtudiantSerImp;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/Etudiant")
@CrossOrigin(origins = "http://localhost:4200/")
public class Etudiantcontroller {
	private final EtudiantSerImp EtudiantService;
	
	
	@GetMapping("/getEtudiant")
	@ResponseBody
    public List<Etudiant> getEtudiant(){
        List<Etudiant> Etudiant=EtudiantService.listeEtudiant();
        return(Etudiant);}
	
	@GetMapping("/getEtudiant/{id}")
    public Etudiant getEtudiantbyid (@PathVariable(value = "id", required = true) Long id){
        Etudiant Etudiant=EtudiantService.get(id);
        return(Etudiant);}
	
	@GetMapping("/getEtudiantbycin/{cin}")
    public Etudiant getEtudiantbycin (@PathVariable(value = "cin", required = true) int cin){
        Etudiant Etudiant=EtudiantService.findByCin(cin);
        return(Etudiant);}
	
	
	@PostMapping("/ajouterEtudiant")
    public ResponseEntity<Etudiant> ajouterEtudiant(@RequestBody Etudiant Etudiant){
		Etudiant newEtudiant = EtudiantService.ajouterEtudiant(Etudiant);
        return new ResponseEntity<>(newEtudiant, HttpStatus.CREATED);
    }
	@PutMapping("/modifierEtudiant")
    public ResponseEntity<Etudiant> modifierEtudiant(@RequestBody Etudiant Etudiant){
		Etudiant updatedEtudiant = EtudiantService.modifierEtudiant(Etudiant);
        return new ResponseEntity<>(updatedEtudiant, HttpStatus.OK);
    }
	@DeleteMapping("/supprimerEtudiant/{id}")
    public ResponseEntity<?> supprimerEtudiant(@PathVariable(value = "id", required = true) Long id){
        System.out.println("test test");
        EtudiantService.supprimerEtudiant(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
	
}
