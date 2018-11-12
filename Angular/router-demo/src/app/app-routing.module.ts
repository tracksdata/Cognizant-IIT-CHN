import { PageNotfoundComponent } from './page-notfound/page-notfound.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DashBoardComponent } from './dash-board/dash-board.component';
import { ListAllComponent } from './list-all/list-all.component';
import { ProductFormComponent } from './product-form/product-form.component';

const routes: Routes = [
  {path:'',component:DashBoardComponent},
  {path:'list',component:ListAllComponent},
  {path:'save',component:ProductFormComponent},
  {path:'*',component:PageNotfoundComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
