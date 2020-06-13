package com.example.Whathg_Database.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.Whathg_Database.DTO.CouresDTO;

import com.example.Whathg_Database.model.Coures;



import com.example.Whathg_Database.service.CouresSevice;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class Coures_contlloler {
	
	
	@Autowired
	CouresSevice couresSevice; 

	



	@PostMapping(value="/Couressave")
	public ResponseEntity<Coures> save(@RequestBody CouresDTO couresDTO){
	  System.out.println("coures save call");
	 return couresSevice.createCouresDTO(couresDTO); 
	}

	@GetMapping("/Coures")
	public ResponseEntity<List<Coures>> getCoures() {
	 return couresSevice.getCourse();
	}



}
