import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({ providedIn: 'root' })
export class CreditService {
  private baseUrl = 'http://localhost:8080/api/credits';

  constructor(private http: HttpClient) {}

  getCredits(): Observable<any[]> {
    return this.http.get<any[]>(this.baseUrl);
  }

  createCredit(credit: any): Observable<any> {
    return this.http.post(this.baseUrl, credit);
  }
}
