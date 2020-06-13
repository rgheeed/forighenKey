package com.example.Whathg_Database.model;


import java.io.Serializable;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Recommendation")
public class Recommendation implements Serializable {
 
	
	
  private static final long serialVersionUID = -3009157732242241606L;
  
  //Recommendation ID
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long Recommendation_id;
  
  @ManyToOne(fetch=FetchType.LAZY,optional=false)
  @JoinColumn(name="NationalID",nullable=false)
  private Individual NationalID; 
  
  
  @ManyToOne(fetch=FetchType.LAZY,optional=false)
  @JoinColumn(name="Edu_iD",nullable=false)
  private Education education; 
  
  

//  @ManyToOne(fetch=FetchType.LAZY,optional=false)
//  @JoinColumn(name="comanRefence",nullable=false)
  private Company comanRefence;
 
  
	
  //Person who write it
  @NotNull(message = " cannot be Empty ")
  @Column(name = "Recommendation_From")
  private String Recommendation_From;
  
  //Recommendation Creation date
  @NotNull(message = " cannot be Empty ")
  @Column(name = "Recommendation_Date")
  private Timestamp Recommendation_Date;
  
  //User Who added Recommendation 
  @NotNull(message = " cannot be Empty ")
  @Column(name = "Recommendation_AddBy")
  private String Recommendation_AddBy;
  
  //URL Recommendation attachment
  @NotNull(message = " cannot be Empty ")
  @Column(name = "Recommendation_Attach")
  private String Recommendation_Attach;
  
  @Builder
public Recommendation(long recommendation_id, Individual nationalID, Education education, Company comanRefence,
		@NotNull(message = " cannot be Empty ") String recommendation_From,
		@NotNull(message = " cannot be Empty ") Timestamp recommendation_Date,
		@NotNull(message = " cannot be Empty ") String recommendation_AddBy,
		@NotNull(message = " cannot be Empty ") String recommendation_Attach) {
	super();
	Recommendation_id = recommendation_id;
	NationalID = nationalID;
	this.education = education;
	this.comanRefence = comanRefence;
	Recommendation_From = recommendation_From;
	Recommendation_Date = recommendation_Date;
	Recommendation_AddBy = recommendation_AddBy;
	Recommendation_Attach = recommendation_Attach;
}

public Recommendation() {
	super();
	
}



  
  
  
  
  
 
}