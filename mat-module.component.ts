import { Component, OnInit } from '@angular/core';
import { SharedService } from '../shared.service';
@Component({
  selector: 'app-mat-module',
  templateUrl: './mat-module.component.html',
  styleUrls: ['./mat-module.component.css']
})
export class MatModuleComponent implements OnInit{
   /* matieres = [
    { nom: 'Mathématiques', ds: 12, tp: 15, examen: 14 },
    { nom: 'Physique', ds: 10, tp: 13, examen: 16 },
    { nom: 'Informatique', ds: 15, tp: 16, examen: 17 }
  ];
matiere: any;
matierecomponent: any;*/
  constructor(public _shared: SharedService){}
  ngOnInit(): void {
    
  }
}




