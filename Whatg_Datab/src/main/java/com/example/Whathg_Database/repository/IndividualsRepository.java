package com.example.Whathg_Database.repository;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Whathg_Database.model.Individual;


@Repository
@Transactional
public interface IndividualsRepository extends CrudRepository<Individual, String>{

	@Modifying
	@Query("UPDATE Individual individual SET individual.email = :email WHERE individual.nationalid = :nationalid")
	void updateEemail(@Param("nationalid") String nationalid, @Param("email") String email);

	@Modifying
	@Query("UPDATE Individual individual SET individual.phoneNumber = :phoneNumber WHERE individual.nationalid = :nationalid")
	void updatePhoneNumberl(@Param("nationalid") String nationalid, @Param("phoneNumber") String phoneNumber);

	@Modifying
	@Query("UPDATE Individual individual SET individual.address = :address WHERE individual.nationalid = :nationalid")
	void updateAddress(@Param("nationalid") String nationalid, @Param("address") String address);

	@Modifying
	@Query("UPDATE Individual individual SET individual.password = :password WHERE individual.nationalid = :nationalid")
	void updatePassword(@Param("nationalid") String nationalid, @Param("password") String password);
	
	
	
	Individual findByEmail(String email);

	Individual findByEmailAndPassword(String email ,String password );
	
//	Individual findById(String nationalid);
	
	
	
}

