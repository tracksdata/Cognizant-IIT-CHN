import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-counter',
  templateUrl: './counter.component.html',
  styleUrls: ['./counter.component.css']
})
export class CounterComponent implements OnInit {

  constructor() { }

  @Input()
  btnLabel:string;
  counter=0;
  @Output()
  totalCount=new EventEmitter();
  increment(){
    this.counter+=1;
    this.totalCount.emit(this.counter);

  }

  ngOnInit() {
  }

}
