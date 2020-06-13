package com.example.Whathg_Database.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Whathg_Database.DTO.ComExperienceDTO;
import com.example.Whathg_Database.DTO.CompanyDTO;
import com.example.Whathg_Database.DTO.ExperienceDTO;
import com.example.Whathg_Database.model.Company;
import com.example.Whathg_Database.model.Experience;
import com.example.Whathg_Database.repository.ExperienceRepository;
import com.example.Whathg_Database.service.ExpericnceService;






@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class Experience_Controller {

	
	
	@Autowired
	ExpericnceService expericnceService;
	
	
	
	@PostMapping(value="/experiencesave")
	public ResponseEntity<Experience> save(@RequestBody ExperienceDTO experienceDTO){
		   System.out.println("company save call");
		  return expericnceService.createExperienceDTO(experienceDTO); 
	}
	
//	@PostMapping(value="/experiencesave")
//	@RequestMapping(method = RequestMethod.POST, path = "/insertEduCertificate")
//	public ResponseEntity<?> insertCertificate(@RequestBody ComExperienceDTO experienceDTO) {
//		return ResponseEntity.ok(expericnceService.createExperienceDTO(experienceDTO));
//	}
	
	
	
		
	@GetMapping("/experience")
	public ResponseEntity<List<Experience>> getExperience() {
		  return expericnceService.getExperience();
	}
}
