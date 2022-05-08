import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../models/User';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  private createUserUrl = 'http://localhost:8080/api/user';

  constructor(private httpClient: HttpClient) { }

  createUser(user: User): Observable<User> {
    localStorage.setItem('username', user.username);
    localStorage.setItem('password', user.password);
    return this.httpClient.post<User>(this.createUserUrl, user);
  }
}
