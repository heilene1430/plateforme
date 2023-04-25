import { Component, OnInit } from '@angular/core';
import { NgModule } from '@angular/core';
import { SharedService } from '../shared.service';

@Component({
  selector: 'app-ajout-matiere',
  templateUrl: './ajout-matiere.component.html',
  styleUrls: ['./ajout-matiere.component.css']
})
export class AjoutMatiereComponent {
  matiere ={
    nomMat:'',
     ds: ''  ,
   tp: '' ,
   examen: '',
  }
  //matieres:any[]=[];
  ajout ()
  {
    this._shared.matieres.push (this.matiere);
   this.matiere ={
      nomMat:'',
       ds: ''  ,
     tp: '' ,
     examen: '',
    }
    
    }
   constructor(public _shared:SharedService){}
  }
 






