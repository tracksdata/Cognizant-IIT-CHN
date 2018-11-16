import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  products: Array<any> = []

  constructor(private productService: ProductService) { }

  ngOnInit() {
    this.productService.loadAllProducts()
      .subscribe((products: any) => this.products = products)
  }

  delete(id) {
    this.productService.delete(id)
      .subscribe(response => {
        console.log(response)
        this.products = this.products.filter(product => product.prodId !== id)
      })
  }

}
