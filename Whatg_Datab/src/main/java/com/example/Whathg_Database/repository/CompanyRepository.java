package com.example.Whathg_Database.repository;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Whathg_Database.model.Company;
import com.example.Whathg_Database.model.Individual;


@Repository
@Transactional
public interface CompanyRepository extends CrudRepository<Company, Integer>{
	 
	
	 
	  @Modifying


	
		@Query("Update Company company SET company.email = :email WHERE company.CR = :CR ")
		void updateEmail(@Param("CR") String CR, @Param("email") String email); 
		@Modifying
		@Query("Update Company company SET company.phoneNumber = :phoneNumber WHERE company.CR = :CR ")
		void updatePhoneNumber(@Param("CR") String CR, @Param("phoneNumber") String phoneNumber); 
		@Modifying
		@Query("Update Company company SET company.address = :address WHERE company.CR = :CR ")
		void updateAddress(@Param("CR") String CR, @Param("address") String address); 
		@Modifying
		@Query("Update Company company SET company.password = :password WHERE company.CR = :CR ")
		void updatePassword(@Param("CR") String CR, @Param("password") String password); 
		
		
//   	@Modifying
//		@Query("Update Company company SET company.StartDate = :StartDate WHERE company.CR = :CR ")
//		void updateStartDate(@Param("CR") String CR, @Param("StartDate") Timestamp StartDate); 
//		@Modifying
//		@Query("Update Company company SET company.EndDate = :EndDate WHERE company.CR = :CR ")
//		void updateEndDate(@Param("CR") String CR, @Param("EndDate") Timestamp EndDate);
		Company findByEmail(String email);
		//Optional<Company> findById(String CR); 
		Company findByEmailAndPassword(String email, String password);
	
}


