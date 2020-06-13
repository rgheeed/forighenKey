package com.example.Whathg_Database.model;

import java.io.Serializable;


import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter

@Entity
@Table(name = "Certification")
public class Certification implements Serializable {

	@Id
	@Column(name = "CERT_id")
	private String CERT_id;
	
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name = "indID", nullable = false, unique = false)
	private Individual indID; 

//	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	@JoinColumn(name = "nationalid", nullable = false)
//	private Individual nationalid;

	@NotNull(message = " cannot be Empty ")
	@Column(name = "UNI_NAME")
	private String UNI_NAME;
	@NotNull(message = " cannot be Empty ")

	@Column(name = "ADDBY")
	private String ADDBY;
	@NotNull(message = " cannot be Empty ")
	@Column(name = "CERT_DATE")
	private Timestamp CERT_DATE;
	@NotNull(message = " cannot be Empty ")
	@Column(name = "GPA")
	private int GPA;
	@NotNull(message = " cannot be Empty ")
	@Column(name = "DEGREE")
	private String DEGREE;
	@NotNull(message = " cannot be Empty ")
	@Column(name = "MAJOR")
	private String MAJOR;
	@NotNull(message = " cannot be Empty ")
	@Column(name = "ATTACH")
	private String ATTACH;

	@Builder
	public Certification(String cERT_id,Individual indID, @NotNull(message = " cannot be Empty ") String uNI_NAME,
			@NotNull(message = " cannot be Empty ") String aDDBY,
			@NotNull(message = " cannot be Empty ") Timestamp cERT_DATE,
			@NotNull(message = " cannot be Empty ") int gPA, @NotNull(message = " cannot be Empty ") String dEGREE,
			@NotNull(message = " cannot be Empty ") String mAJOR,
			@NotNull(message = " cannot be Empty ") String aTTACH) {
		super();
		CERT_id = cERT_id;
		this.indID = indID;
		//this.nationalid = nationalid;
		UNI_NAME = uNI_NAME;
		ADDBY = aDDBY;
		CERT_DATE = cERT_DATE;
		GPA = gPA;
		DEGREE = dEGREE;
		MAJOR = mAJOR;
		ATTACH = aTTACH;
	}

	

}