import { ProductService } from './../product.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-list-all',
  templateUrl: './list-all.component.html',
  styleUrls: ['./list-all.component.css']
})
export class ListAllComponent implements OnInit {

  products:Array<any>=[];
  constructor(private ps:ProductService) { }

  ngOnInit() {
    this.ps.loadAll().subscribe(products=>{
     // console.dir(products);
     this.products=products;
  
    });
  }

}
