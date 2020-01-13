package com.sgic.internal.employee.dto.mapper;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.internal.employee.dto.DesignationDTO;
import com.sgic.internal.employee.dto.converter.DesignationConverter;
import com.sgic.internal.employee.dto.converter.EmployeeConverter;
import com.sgic.internal.employee.entities.Designation;
import com.sgic.internal.employee.repositories.DesignationRepository;
import com.sgic.internal.employee.services.DesignationService;

@Service
public class DesignationDTOMapper {

	@Autowired
	// Designation Service
	private DesignationService designationService;

	@Autowired
	// Designation DTO converter
	private EmployeeConverter employeeConverter;
	
	@Autowired
	// Designation DTO converter
	private DesignationConverter designationConverter;

	@SuppressWarnings("unused")
	private static Logger logger = LogManager.getLogger(DesignationRepository.class);

	@SuppressWarnings("static-access")
	// Save Method for DesignationDTOMapper
	public Designation savedesignation(DesignationDTO designationDTO) {
		logger.info("Successfully Saved Designation");
		return designationService.savedesignation(designationConverter.DesignationDTOToDesignation(designationDTO));
	}

	@SuppressWarnings("static-access")
	// Get All Method for DesignationDTOMapper
	public List<DesignationDTO> getAllDesignation() {
		logger.info(" Employee Successfully Listed ");
		List<Designation> designationlist = designationService.getAllDesignation();
		return designationConverter.DesignationToDesignationDTO(designationlist);
	}

	// Find By Id Method for DesignationDTOMapper
	public Designation getBydesignationid(Long designationid) {
		logger.info("Successfully get Designation by Id");
		return designationService.getBydesignationid(designationid);
	}
	
//	public Employee getBydesignationName(String designationname) {
//		logger.info("Successfully get Designation by Id");
//		return (Employee) designationService.getBydesignationname(designationname);
//	}

	// Delete Method for DesignationDTOMapper
	public DesignationDTO deleteBydesignationid(Long designationid) {
		logger.info(" successfully deleted ");
		designationService.deleteDesignationBydesignationid(designationid);
		return null;
	}
	
	public List<DesignationDTO> gethr(){
		logger.info("Successfully Get Employee By Designation");
		List<Designation> designation = designationService.getByHR();
		return designationConverter.DesignationToDesignationDTO(designation);

	}
	
	public List<DesignationDTO> getothers(){
		logger.info("Successfully Get Employee By Designation");
		List<Designation> designation = designationService.getByOthers();
		return designationConverter.DesignationToDesignationDTO(designation);

	}
}
