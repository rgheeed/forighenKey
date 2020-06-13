
import { Component, OnInit } from '@angular/core';
import { Education } from '../education';
import { EducationService } from '../education-service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-education-form',
  templateUrl: './education-form.component.html',
  styleUrls: ['./education-form.component.css']
})
export class EducationFormComponent implements OnInit {

  education = new Education();
  submitted = false;

  constructor( private educationService : EducationService,private router:Router) { }

  ngOnInit() {
  }
  
  // newEducation(): void {
  //   this.submitted = false;
  //   this.education = new Education();
  // }
  // onSubmit() {
  //   this.save();
  // }
  // save() {
  //   this.educationService.createEducation(this.education)
  //     .subscribe(
  //       data => {
  //         console.log(data);
  //         this.submitted = true;
  //       },
  //       error => console.log(error))
  //   this.education = new Education();
  // }



  registerEducation() {
    this.educationService.registerEducation(this.education)
      .subscribe(
        data => {
          console.log(data);
          this.submitted = true;
        },
        error => console.log(error));
    this.education = new Education();
    this.router.navigate(["/home"])
  }


}
