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
import tn.enicarthage.entites.notes;
import tn.enicarthage.services.implementation.NoteSerImp;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/Note")
public class Notecontroller {
private final NoteSerImp NoteService;

	@GetMapping("/getNote")
    public List<notes> getNote(){
        List<notes> Module=NoteService.listenotes();
        return(Module);}
    
    @GetMapping("/getNoteEtd/{id_etd}")
    public List<notes> getNotesByEtudiantId(@PathVariable (value = "id_etd", required = true)Long etdId) {
        return NoteService.getNotesByEtudiantId(etdId);
    }
	
	@PostMapping("/ajouterNote")
    public ResponseEntity<notes> ajouterNote(@RequestBody notes Note){
		notes newNote = NoteService.ajouternotes(Note);
        return new ResponseEntity<>(newNote, HttpStatus.CREATED);}
	
	
	
	@PutMapping("/modifierNote")
    public ResponseEntity<notes> modifierNote(@RequestBody notes Note){
		notes updatedNote = NoteService.modifiernotes(Note);
        return new ResponseEntity<>(updatedNote, HttpStatus.OK);
    }

    @DeleteMapping("/supprimerNote/{id}")
    public ResponseEntity<?> supprimerNote(@PathVariable(value = "id", required = true) Long id){
        System.out.println("test test");
        NoteService.supprimernotes(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}