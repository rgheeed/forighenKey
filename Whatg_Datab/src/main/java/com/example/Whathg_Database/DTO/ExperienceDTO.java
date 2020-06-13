package com.example.Whathg_Database.DTO;

import java.sql.Timestamp;

import com.example.Whathg_Database.model.Company;
import com.example.Whathg_Database.model.Education;
import com.example.Whathg_Database.model.Individual;

import lombok.Getter;
import lombok.Setter;


@Getter         
@Setter

public class ExperienceDTO {
	
private Long  expid;

private long  id;
	private String eposition;
	 private String nationalid; 

  

    //private Company comanyrefrence; 
    private Timestamp sdate;
  //  private Education edution; 
    private Timestamp edate;

//    private Company comanyname; 
    private String addby;
   
    
    private String companyname;

    
    private String companyemail;


	public ExperienceDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ExperienceDTO(Long expid,long  id,String nationalid, String eposition, Timestamp sdate, Timestamp edate,
			String addby, String companyname, String companyemail) {
		super();
		this.expid = expid;
		//this.id=id;
		this.nationalid = nationalid;
		this.eposition = eposition;
		this.sdate = sdate;
		this.edate = edate;
		this.addby = addby;
		this.companyname = companyname;
		this.companyemail = companyemail;
	}
    
}
