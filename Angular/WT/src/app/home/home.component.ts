import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Company } from '../admin/company';
import { HardcodedAuthenticationService } from '../service/hardcoded-authentication.service';
import {NgForm} from '@angular/forms'
import { IndiService } from '../admin/indi.service';
import { Individual } from '../admin/individual';
import { CompanyServiceService } from '../admin/company-service.service';
import { EducationService } from '../admin/education-service.service';
import { Education } from '../admin/education';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  individual = new Individual();
  education = new Education();
  company =new Company();

  msg = ''

  constructor(private router:Router ,private indiService:IndiService,private comService: CompanyServiceService,private eduService:EducationService ) { }

  ngOnInit(): void {
    
    
    

  }

  loginIndi(){

    this.indiService.loginIndividual(this.individual).subscribe(
      data => { console.log("response recieved");
      console.log(data.firstname);
      localStorage.setItem('name',data.firstname); 
      this.router.navigate(["/indi"])
    
    
    }
      ,
      error => {
        console.log("exception occured");
        this.msg="Enter valid email and password"
      }
    )

  }

  logoutInd(){

    localStorage.removeItem("name");
    localStorage.clear();
  }


  loginCompany(){

    this.comService.loginCompany(this.company).subscribe(
      data => { console.log("response recieved");
      this.router.navigate(["/com"])
    
    
    }
      ,
      error => {
        console.log("exception occured");
        this.msg="Enter valid email and password"
      }
    )

  }

  loginEducation(){

    this.eduService.loginEducation(this.education).subscribe(
      data => { console.log("response recieved");
      this.router.navigate(["/edu"])
    
    
    }
      ,
      error => {
        console.log("exception occured");
        this.msg="Enter valid email and password"
      }
    )

  }


}