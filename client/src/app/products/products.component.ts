import { Input, Output, EventEmitter } from '@angular/core';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  @Input()numeroRipetizioni : number=0
  @Output() buy=new EventEmitter<number>()
  compra(){
    this.numeroRipetizioni--;
    this.buy.emit(this.numeroRipetizioni);
  }

}
