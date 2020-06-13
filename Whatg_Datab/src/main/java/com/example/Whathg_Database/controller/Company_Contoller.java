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
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.Whathg_Database.DTO.CompanyDTO;
import com.example.Whathg_Database.Error.ResourceNotFoundException;
import com.example.Whathg_Database.model.Company;
import com.example.Whathg_Database.model.Individual;
import com.example.Whathg_Database.repository.CompanyRepository;
import com.example.Whathg_Database.service.CompanyService;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
  public class Company_Contoller {
  
	 @Autowired
	 CompanyService companyService; 
	 
	 
	 @Autowired
	 CompanyRepository comRepository;



//@PostMapping(value="/companysave")
//public ResponseEntity<Company> save(@RequestBody CompanyDTO companyDTO){
//	   System.out.println("company save call");
//	  return companyService.createcompanyDTO(companyDTO); 
//}
	 
	 
	@RequestMapping(method = RequestMethod.POST, path = "/companysave")
		public ResponseEntity<?> insertCompany(@RequestBody CompanyDTO companyDTO) {
			HashMap<String, Object> rv = companyService.createcompanyDTO(companyDTO);
			return ResponseEntity.ok(rv);
		}
	
	

	
@GetMapping("/company")
public ResponseEntity<List<Company>> getCompanes() {
	  return companyService.getCompanis();
}



@DeleteMapping("/employees/{CRR}")
public Map<String, Boolean> deleteEmployee(@PathVariable(value = "CRR") int CRR)
   throws ResourceNotFoundException {
	Company company = comRepository.findById(CRR)
 .orElseThrow(() -> new ResourceNotFoundException("Comany not found for this CRR :: " + CRR));

  comRepository.delete(company);
  Map<String, Boolean> response = new HashMap<>();
  response.put("deleted", Boolean.TRUE);
  return response;
}



@DeleteMapping("/employeesall/")
public String deleteallEmployee()
   {
	
 

  comRepository.deleteAll();
 
  
  return "done ";
}


@PostMapping("/registercom")
public Company registerCompany(@RequestBody Company company) throws Exception{
	
	String tempEmail = company.getEmail();
	if(tempEmail !=null && !"".equals(tempEmail)) {
		Company companyObject = companyService.fetchCompanyByEmail(tempEmail);
		if(companyObject != null) {
			throw new Exception("Company with "+tempEmail+" is already exist");
		}
	}
	Company companyobject = null;
	companyobject = companyService.saveCompany(company);
	return companyobject;
}

@PostMapping("/logincom")
public Company loginCompany(@RequestBody Company company) throws Exception {
	
	String tempEmail= company.getEmail();
	String tempPass = company.getPassword();
	Company companyObj = null;
	if(tempEmail !=null && tempPass !=null) {
		
		companyObj = companyService.fetchCompanyByEmailAndPassword(tempEmail, tempPass);
		
	}
	
	if(companyObj == null) {
		throw new Exception("Baaaaad credentials");
	}
	
	
	return companyObj;
}



}
  
  