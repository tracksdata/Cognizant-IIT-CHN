import { Component } from '@angular/core';
import { TouchSequence } from 'selenium-webdriver';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  

  childMsg:string;
  toChild:string;

  f1(parentData){
    this.toChild=parentData;
  }
  display(msg){
    this.childMsg=msg;
  }
  

}
