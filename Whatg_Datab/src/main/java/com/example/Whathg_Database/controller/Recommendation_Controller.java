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


import com.example.Whathg_Database.DTO.RecommendationDTO;

import com.example.Whathg_Database.model.Recommendation;

import com.example.Whathg_Database.service.RecommendationService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class Recommendation_Controller {

	
	@Autowired
	RecommendationService recommendationService; 

	



	@PostMapping(value="/Recommendationsave")
	public ResponseEntity<Recommendation> save(@RequestBody RecommendationDTO recommendationDTO){
	  System.out.println("Recommendation save call");
	 return recommendationService.createRecommendationDTO(recommendationDTO); 
	}

	@GetMapping("/Recommendation")
	public ResponseEntity<List<Recommendation>> getLanguage() {
	 return recommendationService.getRecommendation();
	}

}
