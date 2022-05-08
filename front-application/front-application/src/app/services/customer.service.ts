import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Customer } from '../models/Customer';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  private baseGetCustomUrl = 'http://localhost:8080/api/customer/';

  constructor(private httpClient: HttpClient) { }

  getCustomer(customerId: number): Observable<Customer> {
    console.log(localStorage.getItem('username'))
    console.log(localStorage.getItem('password'))
    const headers = new HttpHeaders({ Authorization: 'Basic ' + btoa(localStorage.getItem('username') + ":" + localStorage.getItem('password'))});

    return this.httpClient.get<Customer>(this.baseGetCustomUrl + customerId, {headers});
  }
}
