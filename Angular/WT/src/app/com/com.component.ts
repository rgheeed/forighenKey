import { Component, OnInit } from '@angular/core';
import { Experience } from '../experience';
import { ExperienceService } from '../service/experience.service';


@Component({
  selector: 'app-com',
  templateUrl: './com.component.html',
  styleUrls: ['./com.component.css']
})
export class ComComponent implements OnInit {

  experience: Experience = new Experience();
  submitted = false;
  constructor(  private experienceService: ExperienceService ) {
 }

  ngOnInit() {
  }

  newCompany(): void {
    this.submitted = false;
    this.experience = new Experience();
  }
  onSubmit() {
    this.save();
  }
  
  save() {
    this.experienceService.createExperience(this.experience)
      .subscribe(
        data => {
          console.log(data);
          this.submitted = true;
        },
        error => console.log(error));
    this.experience = new Experience();
  }
}