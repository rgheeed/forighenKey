package com.example.Whathg_Database.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Whathg_Database.model.Certification;



@Repository
@Transactional

//<Certification, Long>

//<Name Class model , dataType PK>
                                                                
public interface CertificationRepository extends CrudRepository<Certification, String>{

	 

}
