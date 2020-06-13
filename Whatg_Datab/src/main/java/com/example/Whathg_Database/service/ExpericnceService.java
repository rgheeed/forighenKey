package com.example.Whathg_Database.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.Whathg_Database.DTO.ComExperienceDTO;
import com.example.Whathg_Database.DTO.ExperienceDTO;
import com.example.Whathg_Database.Mapper_Imalmation.ExperienceLMP;
import com.example.Whathg_Database.Mapper_Imalmation.LanguageLMP;
import com.example.Whathg_Database.model.Company;
import com.example.Whathg_Database.model.Education;
import com.example.Whathg_Database.model.Experience;
import com.example.Whathg_Database.model.Individual;
import com.example.Whathg_Database.repository.ExperienceRepository;
import com.example.Whathg_Database.repository.IndividualsRepository;
import com.example.Whathg_Database.repository.LanguageRepository;



@Service
public class ExpericnceService {

	
	@Autowired
	ExperienceRepository experienceRepository;
	

	
	
	
	
	@Autowired
	IndividualsRepository indvRepository;
	
	
	
	private static final ExperienceLMP experienceLMP = new ExperienceLMP();

	
	public  ResponseEntity<Experience> createExperienceDTO(ExperienceDTO experienceDTO) {
		Individual ind = indvRepository.findById(experienceDTO.getNationalid()).get();
		 
		Experience experience = Experience.builder()
				
				
				  .nationalid(ind)
				  .eposition(experienceDTO.getEposition())
				
	          
				.sdate(experienceDTO.getEdate())
				.edate(experienceDTO.getSdate())
				.addby(experienceDTO.getAddby())
				.companyname(experienceDTO.getCompanyname())
				.companyemail(experienceDTO.getCompanyemail())
	            .build();
		
		Experience saveExperience = experienceRepository.save(experience);
	     experienceLMP.domainToDto(saveExperience);
	     return new ResponseEntity<>(saveExperience, HttpStatus.CREATED);
	    
	    
	}
	
	
	
	
	public ResponseEntity<List<Experience>> getExperience(){
		
		 List<Experience> exp = new ArrayList<Experience>();
		 experienceRepository.findAll().forEach(exp::add);
	        return new ResponseEntity<>(exp , HttpStatus.OK);

		
	 }
	
	
	


//	public ResponseEntity<List<Experience>> getExperience(ExperienceDTO experienceDTO){
//		
//		
//		 List<Experience> exp = new ArrayList<Experience>();
//		 experienceRepository.findAllByExpid(experienceDTO.getExpid()).forEach(exp::add);
//	        return new ResponseEntity<>(exp , HttpStatus.OK);
//
//		
//	 }
	
	
	
	
	
	
	
	
}
