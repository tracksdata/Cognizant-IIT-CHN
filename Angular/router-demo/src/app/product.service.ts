import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http:HttpClient) { }

  url='http://localhost:1213/products';
  loadAll():any{
    return this.http.get(this.url);
  }

  saveProduct(product){
    return this.http.post(this.url+'/product',product);
  }


}
