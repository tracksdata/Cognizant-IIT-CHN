import { ProductService } from './../product.service';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-product-form',
  templateUrl: './product-form.component.html',
  styleUrls: ['./product-form.component.css']
})
export class ProductFormComponent implements OnInit {

  productForm:FormGroup;
  
  constructor(private fb: FormBuilder, private ps: ProductService, private router: Router, private route: ActivatedRoute) { }



  handleForm(e){
    let productData = this.productForm.value;
    console.log(productData);
    this.ps.saveProduct(productData)
     .subscribe(response => {
       this.router.navigate(['list'])
      })
  

  }
  messages: any = {};
  ngOnInit() {
    this.productForm = this.fb.group({
      prodId: ['', [Validators.required, Validators.minLength(3)]],
      prodName: [''],
      price: ['0']
    })

    this.productForm.get('prodId').statusChanges
    .subscribe(status => {
      if (status === "INVALID") this.messages['prodId'] = "Invalid ProductId"
      else this.messages['prodId'] = ""
    })
  }
  

}
