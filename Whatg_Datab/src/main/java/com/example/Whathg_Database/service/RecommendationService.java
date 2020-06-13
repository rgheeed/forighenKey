package com.example.Whathg_Database.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.Whathg_Database.DTO.IndividualDTO;
import com.example.Whathg_Database.DTO.RecommendationDTO;
import com.example.Whathg_Database.Mapper_Imalmation.IndivdualMappelamp;
import com.example.Whathg_Database.Mapper_Imalmation.RecommendationLMP;
import com.example.Whathg_Database.model.Individual;
import com.example.Whathg_Database.model.Language;
import com.example.Whathg_Database.model.Recommendation;
import com.example.Whathg_Database.repository.IndividualsRepository;
import com.example.Whathg_Database.repository.RecommendationRepsitory;

@Service
public class RecommendationService {

@Autowired
RecommendationRepsitory recommendationRepsitory;
private static final RecommendationLMP recommendationLMP = new RecommendationLMP();


public ResponseEntity<Recommendation> createRecommendationDTO(RecommendationDTO recommendationDTO) {
	
	Recommendation recommendation = Recommendation.builder()
			.nationalID(recommendationDTO.getNationalID())
            .recommendation_From(recommendationDTO.getRecommendation_From())
            .recommendation_Date(recommendationDTO.getRecommendation_Date())
            .recommendation_AddBy(recommendationDTO.getRecommendation_AddBy())
            .recommendation_Attach(recommendationDTO.getRecommendation_Attach())
           
          
            .build();
	
	Recommendation saveRecommendation = recommendationRepsitory.save(recommendation);
     recommendationLMP.domainToDto(saveRecommendation);
     return new ResponseEntity<>(saveRecommendation, HttpStatus.CREATED);
     
}
	
public ResponseEntity<List<Recommendation>> getRecommendation() {
	List<Recommendation> cou = new ArrayList<Recommendation>();
	recommendationRepsitory.findAll().forEach(cou::add);
	return new ResponseEntity<>(cou, HttpStatus.OK);
}
    
}


