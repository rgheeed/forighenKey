import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Education } from './education';

@Injectable({
  providedIn: 'root'
})
export class EducationService {
  private educationUrl: string;
  constructor(private http: HttpClient) {
    this.educationUrl = 'http://localhost:8080/api/';
   }


   findAll(): Observable<any> {  
    return this.http.get(this.educationUrl+'education');  
  }  

  
 
   createEducation(education: any): Observable<any>{
    return this.http.post<Education>(this.educationUrl+'educationsave', education);
  }


  registerEducation(education: any): Observable<any>{
    return this.http.post<Education>(this.educationUrl+'registeredu', education);
  }


  loginEducation(education: any): Observable<any>{
    return this.http.post<Education>(this.educationUrl+'loginedu', education);
  }
}
