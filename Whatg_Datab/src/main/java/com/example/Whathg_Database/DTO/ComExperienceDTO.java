package com.example.Whathg_Database.DTO;

import java.sql.Timestamp;
import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class ComExperienceDTO {
	
	
	private long  expid;

	private String eposition;
	 private String nationalid; 

    private Timestamp sdate;
  
    private Timestamp edate;
    private String addby;
   
    private String companyname;
    private String companyemail;


}
