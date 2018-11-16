import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http: HttpClient) { }

  loadAllProducts() {
    return this.http.get('http://localhost:1213/products/')
  }
  loadProduct(id) {
    return this.http.get('http://localhost:1213/products/' + id)
  }
  saveProduct(productData, editing) {
    if (!editing)
      return this.http.post('http://localhost:1213/products/product', productData)
    else
      return this.http.put('http://localhost:1213/products/product', productData)
  }
  delete(id) {
    return this.http.delete('http://localhost:1213/products/' + id)
  }
}
