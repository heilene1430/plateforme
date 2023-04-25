import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'ENICplatforme';


  constructor() { }
 /* donnees: any[];
  ngOnInit() {
    this.SheredService.getDonnees().subscribe(
      (data: any[]) => {
        this.donnees = data;
      },
      (error) => {
        console.log(error);
      }
    );*/
  }

