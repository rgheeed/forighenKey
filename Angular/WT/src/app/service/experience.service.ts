import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Experience } from '../experience';


@Injectable({
  providedIn: 'root'
})
export class ExperienceService {

  private experienceurl: string;
  

  constructor(private http: HttpClient) { 
    this.experienceurl = 'http://localhost:8080/api/';
     
  }
 
  findAll(id:number): Observable<any> {  
    return this.http.get(this.experienceurl+'experience');  
  }  
 
   createExperience(experience: any): Observable<any>{
    return this.http.post<Experience>(this.experienceurl+'experiencesave', experience);
  }
}