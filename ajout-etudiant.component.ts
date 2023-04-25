import { Component } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
@Component({
  selector: 'app-ajout-etudiant',
  templateUrl: './ajout-etudiant.component.html',
  styleUrls: ['./ajout-etudiant.component.css']
})
export class AjoutEtudiantComponent {
  student = {
    prenom: '',
    nom: '',
    dateNaissance: '',
    cin: '',
    niveau: ''
  };
  
  constructor(private fb: FormBuilder ,/*private studentService: studentService1.studentService*/) {}
  
  onSubmit() {
   // this.studentService
  }
}
