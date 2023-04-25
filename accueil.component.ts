import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-accueil',
  templateUrl: './accueil.component.html',
  styleUrls: ['./accueil.component.css']
})
export class AccueilComponent implements OnInit {
  events: string[] = ['01/05/2023 - Événement 1', '02/05/2023 - Événement 2', '03/05/2023 - Événement 3'];

 contacts: string[] = [];
  constructor(){}
  ngOnInit(){};
}




