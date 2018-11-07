import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-greet',
  templateUrl: './greet.component.html',
  styleUrls: ['./greet.component.css']
})
export class GreetComponent implements OnInit {

  constructor() { }

  @Input()
  btnLable:string;

  @Output()
  outMsg=new EventEmitter();


   greet(){
     this.outMsg.emit(this.btnLable);
   }


  ngOnInit() {
  }

}
