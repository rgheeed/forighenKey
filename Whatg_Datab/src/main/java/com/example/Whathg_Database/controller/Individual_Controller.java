package com.example.Whathg_Database.controller;



import java.util.Collections
;
import java.util.HashMap;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Whathg_Database.DTO.CompanyDTO;
import com.example.Whathg_Database.DTO.IndividualDTO;
import com.example.Whathg_Database.Error.ResourceNotFoundException;
import com.example.Whathg_Database.model.Company;
import com.example.Whathg_Database.model.Individual;
import com.example.Whathg_Database.repository.IndividualsRepository;
import com.example.Whathg_Database.service.IndividualService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class Individual_Controller {

	
	@Autowired
	
	IndividualService individualService;
	
	
	@Autowired
	IndividualsRepository indvRepository;
	
	
	
//	@PostMapping(value="/Indsave")
//	public ResponseEntity<Individual> save(@RequestBody IndividualDTO individualDTO){
//		   System.out.println("Individual save call");
//		  return individualService.createIndividualDTO(individualDTO); 
//	}
	
	
	
	
	@RequestMapping(method = RequestMethod.POST, path = "/Indsave")
	public ResponseEntity<?> getDomain(@RequestBody IndividualDTO dto) {
		boolean rv = individualService.createIndividualDTO(dto);
		if (rv == true) {
			return ResponseEntity.ok(Collections.singletonMap("response", "ok"));
		} else {
			return ResponseEntity.ok(Collections.singletonMap("response", "error"));
		}
	}
	
	
	
	
	
	@GetMapping("/Indi")
	 public ResponseEntity<List<Individual>> getIndividual() {
		  return individualService.getIndividuals();
		  
	}
	
	
	@RequestMapping("/findIndividual")
	public String find(){
		individualService.getById("1089582538"); 
	return "Done for Company";
	}
	
	
	@DeleteMapping("/delete/{nationalid}")
	public Map<String, Boolean> deleteIndividual(@PathVariable(value = "nationalid") String nationalid)
	   throws ResourceNotFoundException {
		Individual individual = indvRepository.findById(nationalid)
	 .orElseThrow(() -> new ResourceNotFoundException("Comany not found for this nationalid :: " + nationalid));

		indvRepository.delete(individual);
	  Map<String, Boolean> response = new HashMap<>();
	  response.put("deleted", Boolean.TRUE);
	  return response;
	}

	
	
	@DeleteMapping("/deleteall/")
	public String deleteallIndividuals()
	   {
		
		indvRepository.deleteAll();
	 
	  
	  return "done ";
	}

	
	
	

	@PostMapping("/register")
	public Individual registerIndividual(@RequestBody Individual individual) throws Exception{
		
		String tempEmail = individual.getEmail();
		if(tempEmail !=null && !"".equals(tempEmail)) {
			Individual individualObject = individualService.fetchIndividualByEmail(tempEmail);
			if(individualObject != null) {
				throw new Exception("Individual with "+tempEmail+" is already exist");
			}
		}
		Individual individualobject = null;
		individualobject = individualService.saveIndividual(individual);
		return individualobject;
	}
	
	@PostMapping("/login")
	public Individual loginIndividual(@RequestBody Individual individual) throws Exception {
		
		String tempEmail= individual.getEmail();
		String tempPass = individual.getPassword();
		Individual individualObj = null;
		if(tempEmail !=null && tempPass !=null) {
			
			individualObj = individualService.fetchIndividualByEmailAndPassword(tempEmail, tempPass);
			
		}
		
		if(individualObj == null) {
			throw new Exception("Baaaaad credentials");
		}
		
		
		return individualObj;
	}
	
	
	
	
	
	
	
	
	
	
	

	

}

