import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CustomerListComponent } from './customer-list/customerList';
import { CustomerFormComponent } from './customer-form/addNewCustomer';

const routes: Routes = [
  { path: 'customer', component: CustomerListComponent },
  { path: 'addCustomer', component: CustomerFormComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
