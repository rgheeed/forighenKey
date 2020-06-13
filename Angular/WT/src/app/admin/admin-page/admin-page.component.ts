import { Component, OnInit } from '@angular/core';
import { ExperienceService } from 'src/app/service/experience.service';
import { Experience } from 'src/app/experience';

@Component({
  selector: 'app-admin-page',
  templateUrl: './admin-page.component.html',
  styleUrls: ['./admin-page.component.css']
})
export class AdminPageComponent implements OnInit {

  experience: Experience = new Experience();

  constructor(private ex:ExperienceService) { }

  ngOnInit(): void {
  }

  


  epf(){

    this.ex.createExperience( this.experience);
  }

}
