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

import com.example.Whathg_Database.DTO.CertificationDTO;
import com.example.Whathg_Database.model.Certification;
import com.example.Whathg_Database.repository.CertificationRepository;
import com.example.Whathg_Database.service.CertificationService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class Certification_Controller {



@Autowired
CertificationService certificationService; 





@PostMapping(value="/Certisave")
public ResponseEntity<Certification> save(@RequestBody CertificationDTO certificationDTO){
  System.out.println("Certification save call");
 return certificationService.createCertificationDTO(certificationDTO); 
}

@GetMapping("/certification")
public ResponseEntity<List<Certification>> getCompanes() {
 return certificationService.getCerti();
}


}
