import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'client';
  messaggio='che scrivo?';
  ripetizioni=10;

  aggiornaQuantita(rip: number){
    this.ripetizioni=rip;
    this.ripetizioni*=2;
  }
}
