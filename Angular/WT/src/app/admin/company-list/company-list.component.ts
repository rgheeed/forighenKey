import { Observable } from 'rxjs';
import { CompanyServiceService } from './../company-service.service';
import { Company } from './../company';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-company-list',
  templateUrl: './company-list.component.html',
  styleUrls: ['./company-list.component.css']
})
export class CompanyListComponent implements OnInit {
  company: Observable<Company[]>;
  constructor(private companyServiceService: CompanyServiceService) { }

  ngOnInit() {
    this.companyServiceService.findAll().subscribe(data => {
      this.company = data;
    });
  }


  reloadData() {
    this.company = this.companyServiceService.findAll();
  }


  deleteEmployee(cr: String) {
    this.companyServiceService.deleteEmployee(cr)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }


  deleteallEmployee() {
    this.companyServiceService.deleteallEmployee()
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }


  UEmail(cr:String,email:String) {
    this.companyServiceService.UEmail(cr,email)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }



}
