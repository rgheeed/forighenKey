package com.example.Whathg_Database.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.Whathg_Database.DTO.CertificationDTO;

import com.example.Whathg_Database.Mapper_Imalmation.CertificationLMP;

import com.example.Whathg_Database.model.Certification;

import com.example.Whathg_Database.repository.CertificationRepository;

@Service
public class CertificationService {

	@Autowired
	CertificationRepository certificationRepository;
	private static final CertificationLMP certificationLMP = new CertificationLMP();

	public ResponseEntity<Certification> createCertificationDTO(CertificationDTO certificationDTO) {

		Certification certification = Certification.builder()

				.cERT_id(certificationDTO.getCERT_id())

				//.nationalid(certificationDTO.getNationalID())
				.uNI_NAME(certificationDTO.getUNI_NAME())
				.aDDBY(certificationDTO.getADDBY()).cERT_DATE(certificationDTO.getCERT_DATE())

				.gPA(certificationDTO.getGPA()).dEGREE(certificationDTO.getDEGREE()).mAJOR(certificationDTO.getMAJOR())
				.aTTACH(certificationDTO.getATTACH())

				.build();

		Certification saveCertification = certificationRepository.save(certification);
		certificationLMP.domainToDto(saveCertification);

		return new ResponseEntity<>(saveCertification, HttpStatus.CREATED);

	}

	public ResponseEntity<List<Certification>> getCerti() {
		List<Certification> cer = new ArrayList<Certification>();
		certificationRepository.findAll().forEach(cer::add);
		return new ResponseEntity<>(cer, HttpStatus.OK);
	}

}
