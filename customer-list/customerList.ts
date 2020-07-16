import { Component, OnInit } from '@angular/core';
import { Customer } from '../model/customer';
import { CustomerService } from '../service/customer';

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class CustomerListComponent implements OnInit {

  customers: Customer[];

  constructor(private customerServices: CustomerService) {
  }

  ngOnInit() {
    this.customerServices.findAll().subscribe(data => {
      this.customers = data;
    });
  }
}

