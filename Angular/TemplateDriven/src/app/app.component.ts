import { EmployeeService } from './employee.service';
import { Component, OnInit } from '@angular/core';
import { Employee } from './employee';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent{
  model: any = {};
  data:string;

  onSubmit() {
    alert('SUCCESS!! :-)\n\n' + JSON.stringify(this.model))
  }

  test(){
this.data=JSON.stringify(this.model);
  }




}
