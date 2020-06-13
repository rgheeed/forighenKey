import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { EducationService } from '../education-service.service';
import { Education } from '../education';

@Component({
  selector: 'app-edu-list',
  templateUrl: './edu-list.component.html',
  styleUrls: ['./edu-list.component.css']
})
export class EduListComponent implements OnInit {

  education: Observable<Education[]>;
  constructor(private educationService: EducationService) { }

  ngOnInit() {
    this.educationService.findAll().subscribe(data => {
      this.education = data;
    });
  }


  reloadData() {
    this.education = this.educationService.findAll();
  }

}
