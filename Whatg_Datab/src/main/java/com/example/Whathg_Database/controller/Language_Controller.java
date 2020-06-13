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


import com.example.Whathg_Database.DTO.LanguageDTO;

import com.example.Whathg_Database.model.Language;

import com.example.Whathg_Database.service.LanguageService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class Language_Controller {
	
	
	@Autowired
	LanguageService languageService; 

	



	@PostMapping(value="/Languagesave")
	public ResponseEntity<Language> save(@RequestBody LanguageDTO languageDTO){
	  System.out.println("Language save call");
	 return languageService.createLanguageDTO(languageDTO); 
	}

	@GetMapping("/Language")
	public ResponseEntity<List<Language>> getLanguage() {
	 return languageService.getLanguages();
	}


}
