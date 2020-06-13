 package com.example.Whathg_Database.model;



import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.example.Whathg_Database.model.Individual.IndividualBuilder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;




@Getter
@Setter

@Entity
@Table(name = "Education")
public class Education extends User_W  implements Serializable {
	private static final long serialVersionUID = -3009157732242241606L;

	

 
 
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name = "eduid", unique=true)
	  private int eduid;
	 
	  
	  @Column(name = "eduname")
	  private String eduname;

	  @Column(name = "eduType")
		private String eduType; 
		
		

//		@Lob
//		@Column(name = "pdfFile")
//		private byte[] pdfFile; 









	 @Builder
	public Education(String email, String phone_number, String address, String password,String type, int eduid,
			String eduname,String eduType) {
		super(email, phone_number, address, password,"edu");
		this.eduid = eduid;
		this.eduname = eduname;
		this.eduType=eduType;
	}




	public Education(String eduname) {
		super();
		this.eduname = eduname;
	}




	public Education() {
		super();
	}




	
	




	




	

	

	

	
		 
	  }