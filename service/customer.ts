import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Customer } from '../model/customer';
import { Observable } from 'rxjs/Observable';
import {c} from "@angular/core/src/render3";

@Injectable()
export class CustomerService {

  private customersUrl: string;

  constructor(private http: HttpClient) {
    this.customersUrl = 'http://localhost:8080/customer';
  }

  public findAll(): Observable<Customer[]> {
    return this.http.get<Customer[]>(this.customersUrl);
  }

  public save(customer: Customer) {
    return this.http.post<Customer>(this.customersUrl, customer);
  }
}
