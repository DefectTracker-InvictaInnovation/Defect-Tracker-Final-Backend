package com.sgic.internal.employee.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.internal.employee.dto.DesignationDTO;
import com.sgic.internal.employee.dto.mapper.DesignationDTOMapper;
import com.sgic.internal.employee.entities.Designation;
import com.sgic.internal.employee.services.DesignationService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DesignationController {

	@Autowired
	private DesignationDTOMapper designationDTOMapper;
	
	@Autowired
	private DesignationService designationService;

	private static Logger logger = LogManager.getLogger(DesignationDTOMapper.class);

	@PostMapping(value = "/createdesignation")
//	<---Save New Designation API--->
	public Designation savedesignation(@RequestBody DesignationDTO designationDTO) {
		logger.info("Designation Controller -> New Designation Created succesfully");
		return designationDTOMapper.savedesignation(designationDTO);

	}

	@GetMapping(value = "/getAllDesignation")
//	<---List All Designation-->
	public ResponseEntity<List<DesignationDTO>> getAllDesignation() {
		logger.info("Designation Controller -> GetDesignation");
		return new ResponseEntity<>(designationDTOMapper.getAllDesignation(), HttpStatus.OK);
	}

	@GetMapping("/getbydesignationId/{designationid}")
	// <---Get Designation By Designation ID--->
	public ResponseEntity<Designation> getDesignationById(@PathVariable(name = "designationid") Long designationid) {
		logger.info("Designation Controller --> Get by Designation by Id");
		return new ResponseEntity<>(designationDTOMapper.getBydesignationid(designationid), HttpStatus.OK);
	}
	
	@PutMapping("updatedesignation/{designationid}")
	public ResponseEntity<String> updateDesignation(@RequestBody Designation designation) {
		try {
			if (designationService.updateDesignation(designation) != null) {
				return new ResponseEntity<>("Successfully Updated", HttpStatus.OK);
			}
			return new ResponseEntity<>("Failed To Update", HttpStatus.OK);
		} catch (Exception ex) {

		}

		return null;
	}

	@DeleteMapping("/deletedesignation/{designationid}")
	public ResponseEntity<String> deleteDesignation(@PathVariable("designationid") Long designationid) {
		try {
			designationService.deleteDesignationBydesignationid(designationid);
			return new ResponseEntity<>("Deleted Successfully", HttpStatus.OK);
		} catch (Exception ex) {

		}
		return null;
	}
	
//	@GetMapping("/getpm")
//	// <---Get Designation By Designation ID--->
//	public ResponseEntity<List<Employee>> getByName() {
//		logger.info("Designation Controller --> Get by Designation by Id");
//		return new ResponseEntity<>(designationService.getBydesignationname(), HttpStatus.OK);
//	}
//	
//	@GetMapping("/getothers")
//	// <---Get Designation By Designation ID--->
//	public ResponseEntity<List<Employee>> getOtherAllEmployees() {
//		logger.info("Designation Controller --> Get by Designation by Id");
//		return new ResponseEntity<>(designationService.getByQaAndDevelopersOnly(), HttpStatus.OK);
//	}

}
