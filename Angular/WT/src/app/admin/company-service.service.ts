import { Company } from './company';
import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';  

@Injectable({
  providedIn: 'root'
})
export class CompanyServiceService {
  private companyUrl: string;
  private companyUr2: string;
  private companyUr3: string;
  private companyUr4: string;

  constructor(private http: HttpClient) { 
    this.companyUrl = 'http://localhost:8080/api/';
     this.companyUr2 = 'http://localhost:8080/api/employees/';
     this.companyUr3 = 'http://localhost:8080/api/employeesall/';
     this.companyUr4 = 'http://localhost:8080/api/UpdateEmail/';

  }
 
  findAll(): Observable<any> {  
    return this.http.get(this.companyUrl+'company');  
  }  
 
   createCompany(company: any): Observable<any>{
    return this.http.post<Company>(this.companyUrl+'companysave', company);


  }


  deleteEmployee(cr: String): Observable<any> {
    return this.http.delete(`${this.companyUr2}/${cr}`, { responseType: 'text' });
  }


  deleteallEmployee(): Observable<any> {
    return this.http.delete(`${this.companyUr3}`, { responseType: 'text' });
  }


  UEmail(cr:String,email:String): Observable<any> {

    return this.http.post(`${this.companyUr4+'UpdateEmail'}`, { responseType: 'text' });


  }



  registerCompany(company: any): Observable<any>{
    return this.http.post<Company>(this.companyUrl+'registercom', company);
  }


  loginCompany(company: any): Observable<any>{
    return this.http.post<Company>(this.companyUrl+'logincom', company);
  }










}