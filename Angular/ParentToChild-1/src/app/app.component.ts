import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  
  msg:string;

  process(msg){
    this.msg=msg;
    console.log('parent: '+msg);
  }

}
