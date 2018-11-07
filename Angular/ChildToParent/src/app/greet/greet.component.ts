import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-greet',
  templateUrl: './greet.component.html',
  styleUrls: ['./greet.component.css']
})
export class GreetComponent implements OnInit {

  constructor() { }

 
  @Output()
  out=new EventEmitter();

  @Input()
  fromParent:string;

  process(){
    this.out.emit('Good Morming');

  }

  ngOnInit() {
  }

}
