import { ProductService } from './../product.service';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router, ActivatedRoute, ParamMap } from '@angular/router';
import { map, switchMap } from 'rxjs/operators';

@Component({
  selector: 'app-product-form',
  templateUrl: './product-form.component.html',
  styleUrls: ['./product-form.component.css']
})
export class ProductFormComponent implements OnInit {

  productForm: FormGroup;
  messages: any = {};
  editing: boolean = false

  constructor(private fb: FormBuilder, private productService: ProductService, private router: Router, private route: ActivatedRoute) { }

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

    //let id = this.route.snapshot.params['id']

    this.route.params.pipe(map(params => params['id']))
      .subscribe(id => {
        if (id)
          this.productService.loadProduct(id)
            .subscribe(product => {
              this.editing = true;
              this.productForm.setValue(product)
            })
      })


  }

  handleForm(e) {

    let productData = this.productForm.value;
    this.productService.saveProduct(productData, this.editing)
      .subscribe(response => {
        this.router.navigate(['all'])
      })
  }

}
