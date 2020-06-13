package com.example.Whathg_Database.controller;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.Whathg_Database.DTO.EducationDTO;
import com.example.Whathg_Database.model.Company;
import com.example.Whathg_Database.model.Education;
import com.example.Whathg_Database.service.EducationService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class Education_contoller {

	

	 @Autowired
	 EducationService educationService; 

	
	


//@PostMapping(value="/educationsave")
//public ResponseEntity<Education> save(@RequestBody EducationDTO educationDTO){
//	   System.out.println("education save call");
//	  return educationService.createEducationDTO(educationDTO); 
//}
	 
	 
	 
	 
	 @RequestMapping(method = RequestMethod.POST, path = "/educationsave")
		public ResponseEntity<?> process(@RequestBody EducationDTO eduInstitutionDTO) {
			HashMap<String, Object> rv = educationService.createEducationDTO(eduInstitutionDTO);
			return ResponseEntity.ok(rv);
		}
 
@GetMapping("/education")
public ResponseEntity<List<Education>> getEducation() {
	  return educationService.getEducations();
}
 

@PostMapping("/registeredu")
public Education registerEducation(@RequestBody Education education) throws Exception{
	
	String tempEmail = education.getEmail();
	if(tempEmail !=null && !"".equals(tempEmail)) {
		Education educationObject = educationService.fetchEducationByEmail(tempEmail);
		if(educationObject != null) {
			throw new Exception("Education with "+tempEmail+" is already exist");
		}
	}
	Education educationobject = null;
	educationobject = educationService.saveEducation(education);
	return educationobject;
}

@PostMapping("/loginedu")
public Education loginEducation(@RequestBody Education education) throws Exception {
	
	String tempEmail= education.getEmail();
	String tempPass = education.getPassword();
	Education educationObj = null;
	if(tempEmail !=null && tempPass !=null) {
		
		educationObj = educationService.fetchEducationByEmailAndPassword(tempEmail, tempPass);
		
	}
	
	if(educationObj == null) {
		throw new Exception("Baaaaad credentials");
	}
	
	
	return educationObj;
}
 



}