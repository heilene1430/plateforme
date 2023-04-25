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
import tn.enicarthage.entites.Module;
import tn.enicarthage.services.implementation.ModuleSerImp;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/Module")
public class Modulecontroller {
private final ModuleSerImp ModuleService;
	
	@GetMapping("/getModule")
    public List<Module> getModule(){
        List<Module> Module=ModuleService.listeModule();
        return(Module);}
	
	@PostMapping("/ajouterModule")
    public ResponseEntity<Module> ajouterModule(@RequestBody Module Module){
		Module newModule = ModuleService.ajouterModule(Module);
        return new ResponseEntity<>(newModule, HttpStatus.CREATED);}
	
	
	
	@PutMapping("/modifierModule")
    public ResponseEntity<Module> modifierModule(@RequestBody Module Module){
		Module updatedModule = ModuleService.modifierModule(Module);
        return new ResponseEntity<>(updatedModule, HttpStatus.OK);
    }
	@DeleteMapping("/supprimerModule/{id}")
    public ResponseEntity<?> supprimerModule(@PathVariable(value = "id", required = true) Long id){
        System.out.println("test test");
        ModuleService.supprimerModule(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
