package com.example.Whathg_Database.model;



import java.io.Serializable;
import java.sql.Timestamp;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "Individual")

public class Individual extends User_W implements Serializable {
	
	
	  private static final long serialVersionUID = -3009157732242241606L;
	  
//	  
//		@Id
//		@GeneratedValue(strategy = GenerationType.IDENTITY)
//		@Id
//	    @GeneratedValue(strategy = GenerationType.AUTO)
//		@Column(name = "indID")
//		private Long indId;    
		//#May

	
	  @Id 
	  @Column(name = "nationalid")
	  private String nationalid;
	  
	  @NotNull(message = " cannot be Empty ")
	  @Column(name = "firstname")
	  @NotNull(message = " cannot be Empty ")
	  private String firstname;
	  @NotNull(message = " cannot be Empty ")
	  @Column(name = "mname")
	  private String mname;
	  @NotNull(message = " cannot be Empty ")
	  @Column(name = "lastname")
	  private String lastname;
	  
	  @NotNull(message = " cannot be Empty ")
	  @Column(name = "gender")
	  private String gender;
	  @NotNull(message = " cannot be Empty ")
	  
	  
	  
	  @NotNull(message = " cannot be Empty ")
	  @Column(name = "dob")
	  private Timestamp dob;
	  
	  
	  
	@Builder
	public Individual() {
		super();
		
	}

    @Builder
	public Individual(String email, String phone_number, String address, String password,String type, String nationalid,
			@NotNull(message = " cannot be Empty ") @NotNull(message = " cannot be Empty ") String firstname,
			@NotNull(message = " cannot be Empty ") String mname,
			@NotNull(message = " cannot be Empty ") String lastname,
			@NotNull(message = " cannot be Empty ") String gender,
			
			@NotNull(message = " cannot be Empty ") Timestamp dob) {
		super(email, phone_number, address, password , "ind");
		this.nationalid = nationalid;
		this.firstname = firstname;
		this.mname = mname;
		this.lastname = lastname;
		this.gender = gender;
		this.dob = dob;
		
	}

	

	 

	



	}