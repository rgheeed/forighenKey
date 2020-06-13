package com.example.Whathg_Database.DTO;




import java.sql.Timestamp;

import javax.validation.constraints.Email;

import com.example.Whathg_Database.model.Individual;
import com.example.Whathg_Database.model.User_W;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IndividualDTO extends User_W {
	
	
	//private Long indId; 
	  private String nationalid;
	


	private String firstname;

	private String mname;

	private String lastname;

	private String gender;

//	private String status;
//
//	private String skills;

	private Timestamp dob;

	//private String attachments;





	public IndividualDTO() {
		super();
		// TODO Auto-generated constructor stub
	}





	public IndividualDTO(String email, String phone_number, String address,String type, String password, String nationalid,
			String firstname, String mname, String lastname, String gender, String status, String skills, Timestamp dob,
			String attachments) {
		super(email, phone_number, address, password,"ind");
		this.nationalid = nationalid;
		this.firstname = firstname;
		this.mname = mname;
		this.lastname = lastname;
		this.gender = gender;
//		this.status = status;
//		this.skills = skills;
		this.dob = dob;
//		this.attachments = attachments;
	}

	






	






	
}

