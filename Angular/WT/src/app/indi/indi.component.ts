import { Component, OnInit } from '@angular/core';
import { ExperienceService } from '../service/experience.service';
import { Experience } from '../experience';
import { Observable } from 'rxjs';
import { Individual } from '../admin/individual';

@Component({
  selector: 'app-indi',
  templateUrl: './indi.component.html',
  styleUrls: ['./indi.component.css']
})
export class IndiComponent implements OnInit {
    experience: Observable<Experience[]>;
    individual: Observable<Individual[]>;
    name: string;
  constructor(private experienceService:ExperienceService) { }
  id:number

  ngOnInit(): void {
    //id:Number
    this.experienceService.findAll(this.id).subscribe(data => {
        this.experience = data;

      });

      this.name = localStorage.getItem('name');

      

    var modal = document.getElementById('id01');
    
    // When the user clicks anywhere outside of the modal, close it
    window.onclick = function(event) {
        if (event.target == modal) {
            modal.style.display = "none";
        }
    }


    var modal2 = document.getElementById('id02');
    
    // When the user clicks anywhere outside of the modal, close it
    window.onclick = function(event) {
        if (event.target == modal2) {
            modal2.style.display = "none";
        }
    }

    var modal3 = document.getElementById('id03');
    
    // When the user clicks anywhere outside of the modal, close it
    window.onclick = function(event) {
        if (event.target == modal3) {
            modal3.style.display = "none";
        }
    }


    var modal4 = document.getElementById('id04');
    
    // When the user clicks anywhere outside of the modal, close it
    window.onclick = function(event) {
        if (event.target == modal4) {
            modal4.style.display = "none";
        }
    }
  }

  
  reloadData() {
    this.experience = this.experienceService.findAll(this.id);
  }


  

}
