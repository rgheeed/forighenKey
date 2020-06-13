package com.example.Whathg_Database.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Whathg_Database.service.AuthService;

@RestController
@RequestMapping("/auth")
public class AuthController {

//	@Autowired
//	AuthService authService;
//
//	@RequestMapping(method = RequestMethod.GET, path = "/login")
//	public ResponseEntity<?> authorize(@RequestParam("username") String username,
//			@RequestParam("password") String password) {
//		return ResponseEntity.ok(authService.login(username, password));
//	}
}
