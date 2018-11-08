import { EmployeeService } from './employee.service';
import { Component, OnInit } from '@angular/core';
import { Employee } from './employee';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'App3';

  emp=new Employee();
  e1:Employee;
  data:any;
  products:any[];

  e2={
    empId:11,
    empName:'James',
    salary:4864
  };


  constructor(private empService:EmployeeService){
    console.log('--- constructor')
  }

  ngOnInit(){
   // console.log('--- ngOnInit')
   this.emp.empId=10;
   this.emp.empName='Praveen';
   this.emp.salary=7777;
   this.e1=this.empService.testEmployee();
  }

}
