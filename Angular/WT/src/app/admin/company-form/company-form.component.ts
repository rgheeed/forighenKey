import { Component, OnInit } from '@angular/core';
import { Company } from './../company';
import { Observable } from 'rxjs';
import { ActivatedRoute, Router } from '@angular/router';
import { CompanyServiceService } from './../company-service.service';
@Component({
  selector: 'app-company-form',
  templateUrl: './company-form.component.html',
  styleUrls: ['./company-form.component.css']
})
export class CompanyFormComponent implements OnInit {
  company = new Company();
  submitted = false;
  constructor(  private companyServiceService: CompanyServiceService ) {
 }

  ngOnInit() {
  }

  // newCompany(): void {
  //   this.submitted = false;
  //   this.company = new Company();
  // }
  // onSubmit() {
  //   this.save();
  // }
  
  // save() {
  //   this.companyServiceService.createCompany(this.company)
  //     .subscribe(
  //       data => {
  //         console.log(data);
  //         this.submitted = true;
  //       },
  //       error => console.log(error));
  //   this.company = new Company();
  // }



  registerCompany(){
    this.companyServiceService.registerCompany(this.company)
      .subscribe(
        data => {
          console.log("response recieved");
          this.submitted = true;
          
        },
        error => console.log(error));
        this.company = new Company();

  }
}
