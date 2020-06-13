import { Component, OnInit } from '@angular/core';
import { Individual } from '../individual';
import { IndiService } from '../indi.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-indi-form',
  templateUrl: './indi-form.component.html',
  styleUrls: ['./indi-form.component.css']
})
export class IndiFormComponent implements OnInit {

  submitted = false;
  msg = ''
  individual = new Individual();

  constructor(private individualService :IndiService , private router:Router) { }

  ngOnInit(): void {
  }

  // newIndividual(): void {
  //   this.submitted = false;
  //   this.individual = new Individual();
  // }
  // onSubmit() {
  //   this.save();
  // }
  
  // save() {
  //   this.individualService.createIndividual(this.individual)
  //     .subscribe(
  //       data => {
  //         console.log(data);
  //         this.submitted = true;
  //       },
  //       error => console.log(error));
  //   this.individual = new Individual();
  // }



  registerIndividual(){
    this.individualService.registerIndividual(this.individual)
      .subscribe(
        data => {
          console.log(data.firstname)
          console.log("response recieved");
          localStorage.setItem('name',data.firstname);
          this.submitted = true;
          
          
        },
        error => console.log(error));
        this.individual = new Individual();
        this.router.navigate(["/home"])

  }

}
