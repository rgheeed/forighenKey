import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Individual } from './individual';

@Injectable({
  providedIn: 'root'
})
export class IndiService {

  private indiUrl: string;    
  private indiUrl1: string;
  private indiUrl2: string;

  constructor(private http: HttpClient) { 
    this.indiUrl = 'http://localhost:8080/api/';
    this.indiUrl1='http://localhost:8080/api/delete/';
   this.indiUrl2='http://localhost:8080/api/deleteall';

  }
 
  findAll(): Observable<any> {  
    return this.http.get(this.indiUrl+'Indi');  
  }  
 
   createIndividual(individual: any): Observable<any>{
    return this.http.post<Individual>(this.indiUrl+'Indsave',individual);
  }




  deleteIndividual(nationalid: String): Observable<any> {
    return this.http.delete(`${this.indiUrl1}/${nationalid}`, { responseType: 'text' });
  }


  deleteallIndividuals(): Observable<any> {
    return this.http.delete(`${this.indiUrl2}`, { responseType: 'text' });
  }



  public loginIndividual(individual:Individual): Observable<any> {
    return this.http.post<any>("http://localhost:8080/api/login",individual )
  }



  public registerIndividual(individual:Individual): Observable<any> {
    return this.http.post<any>("http://localhost:8080/api/register",individual )
  }
}
