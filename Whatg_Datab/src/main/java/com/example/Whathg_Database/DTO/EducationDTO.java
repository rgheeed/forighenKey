package com.example.Whathg_Database.DTO;

import java.sql.Timestamp;

import javax.validation.constraints.Email;

import com.example.Whathg_Database.model.Individual;
import com.example.Whathg_Database.model.User_W;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EducationDTO  extends User_W{
	  
	  private int eduid;
	  
	
	  private String eduname;
	  
	  private String eduType; 

	  
	  
	  
	  
	

	
	public EducationDTO() {
		super();
		// TODO Auto-generated constructor stub
	}








	public EducationDTO(String email, String phone_number, String address, String password,String type, int eduid,
			String eduname, String eduType ) {
		super(email, phone_number, address, password,"edu");
		this.eduid = eduid;
		this.eduname = eduname;
		this.eduType = eduType;
	}
	
	
	


	  
}
