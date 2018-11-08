import { Employee } from './employee';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor() { }
  emp=new Employee();

  testEmployee():Employee{
    this.emp.empId=12;
    this.emp.empName='Ozvitha';
    this.emp.salary=43243;
      //console.log('-- Test Employee');
    return this.emp;
  }

}
