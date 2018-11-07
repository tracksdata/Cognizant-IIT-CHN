import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  //name:string;

  //name="Praveen";

  empName='James';
  name='Praveen';
  emp={
    id:'1024',
    name:'Praveen',
    age:87
  }

  cn='n1';
  imgUrl='../assets/cartoons/pic1.png';

  data:string;
test(t1){
  console.log('-- '+t1.value);
  this.cn='n2';
}


}
