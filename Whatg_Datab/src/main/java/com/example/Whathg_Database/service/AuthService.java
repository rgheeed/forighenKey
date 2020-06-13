package com.example.Whathg_Database.service;

import java.util.HashMap;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

	@Autowired
	IndividualService individualService;
	@Autowired
	CompanyService companyService;
	@Autowired
	EducationService eduService;

//	public HashMap<String, Object> login(String username, String password) {
//		HashMap<String, Object> ind = individualService.login(username, password);
//		if ((Boolean) ind.get("success") == true) {
//			return ind;
//		} else {
//			HashMap<String, Object> comp = companyService.login(username, password);
//			if ((Boolean) comp.get("success") == true) {
//				return comp;
//			} else {
//				HashMap<String, Object> edu = eduService.login(username, password);
//				if ((Boolean) edu.get("success")) {
//					return edu;
//				} else {
//					ind.put("success", false);
//					return ind;
//				}
//			}
//		}
//	}

}
