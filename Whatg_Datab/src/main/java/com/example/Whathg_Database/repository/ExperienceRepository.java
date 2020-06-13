package com.example.Whathg_Database.repository;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Whathg_Database.model.Experience;
import com.example.Whathg_Database.model.Individual;





@Repository
@Transactional
public interface ExperienceRepository extends CrudRepository<Experience, Long>{

//	ArrayList<Experience> findAllById(Long expid);

	List<Experience>findAllByExpid(Long expid);
	
	

	//List<Experience> findAllByNationalid(String id);

}
