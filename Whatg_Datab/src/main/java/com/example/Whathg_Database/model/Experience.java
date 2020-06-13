package com.example.Whathg_Database.model;


import java.io.Serializable;


import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import com.example.Whathg_Database.model.Individual.IndividualBuilder;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;





@Getter
@Setter
@Data
@Entity
@Table(name = "Experience")
public class Experience implements Serializable {

    private static final long serialVersionUID = -3009157732242241606L;
    
    
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private long expid;
    
    
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name = "expid", unique=true)
	  private Long expid;
  
    
//    @Column(name = "id", nullable = false)
//	private Long id;
//    
//    
//	@ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
//	@JoinColumn(name = "indID", nullable = false, unique = true)
//	private Individual indID;  
    //May
    
	
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="nationalid",nullable=false, unique = true)
       private Individual nationalid; 
	

//	   @ManyToOne(fetch=FetchType.LAZY,optional=false)
//       @JoinColumn(name="comanyrefrence",nullable=false)
//       private Company comanyrefrence; 
	
	   

//	   @ManyToOne(fetch=FetchType.LAZY,optional=false)
//       @JoinColumn(name="comanyname",nullable=false)
//       private Company comanyname; 
	
	   

//	   @ManyToOne(fetch=FetchType.LAZY,optional=false)
//       @JoinColumn(name="edution",nullable=false)
//       private Education edution; 
	
    
    
//   		@Column(name = "nationalid")
//   
//   		private String nationalid; 

            
                @Column(name = "eposition")
                private String eposition;
                
         @NotNull(message = "cannot be Empty ")
                @Column(name = "sdate")
                private Timestamp sdate;
                @NotNull(message = " cannot be Empty ")
                @Column(name = "edate")
                private Timestamp edate;
                @NotNull(message = " cannot be Empty ")
                @Column(name = "addby")
                private String addby;
                @NotNull(message = " cannot be Empty ")
                @Column(name = "companyname")
                private String companyname;
                
                @Email(message = "Email should be valid")
                @NotNull(message = "cannot be Empty ")
                @Column(name = "companyemail")
                private String companyemail;
                
                
                
                public Experience() {
					super();
					
				}

                
                @Builder
				public Experience(Long expid,Long id,Individual nationalid, String eposition,
						@NotNull(message = " cannot be Empty ") Timestamp sdate,
						@NotNull(message = " cannot be Empty ") Timestamp edate,
						@NotNull(message = " cannot be Empty ") String addby,
						@NotNull(message = " cannot be Empty ") String companyname,
						@Email(message = "Email should be valid") @NotNull(message = " cannot be Empty ") String companyemail) {
					super();
					this.expid = expid;
					//this.id=id;
					//this.indID = indID;
					this.nationalid = nationalid;
					this.eposition = eposition;
					this.sdate = sdate;
					this.edate = edate;
					this.addby = addby;
					this.companyname = companyname;
					this.companyemail = companyemail;
				}

                
              
				

				
				

		
                
                
}