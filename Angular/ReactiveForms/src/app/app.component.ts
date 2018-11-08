import { EmployeeService } from './employee.service';
import { Component, OnInit } from '@angular/core';
import { Employee } from './employee';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MustMatch } from './must-match.validator';
import { Customvalidator } from './customvalidator';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent implements OnInit{
  
  constructor(private formBuilder: FormBuilder) { }

  registerForm: FormGroup;
  submitted = false;
  ngOnInit(){
    this.registerForm = this.formBuilder.group({
      firstName: ['Name goes here', Validators.required],
      lastName: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
      password: ['', [Validators.required, Validators.minLength(6)]],
      confirmPassword: ['', Validators.required],
      phoneNo: ['', [Validators.required,Customvalidator.phoneValidator]],

  }, {
      validator: MustMatch('password', 'confirmPassword')
  });
  
  }

  get f() { return this.registerForm.controls; }

  onSubmit() {
      this.submitted = true;

      // stop here if form is invalid
      if (this.registerForm.invalid) {
          return;
      }

      alert('SUCCESS!! :-)\n\n' + JSON.stringify(this.registerForm.value))
  }




}
