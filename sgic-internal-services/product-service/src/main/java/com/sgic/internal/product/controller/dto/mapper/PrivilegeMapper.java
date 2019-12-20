package com.sgic.internal.product.controller.dto.mapper;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.internal.product.controller.dto.PrivilegeDto;
import com.sgic.internal.product.controller.dto.converter.PrivilegeConverter;
import com.sgic.internal.product.entities.Privilege;
import com.sgic.internal.product.services.PrivilegeService;

@Service
public class PrivilegeMapper {

	@Autowired
	private PrivilegeConverter privilegeConverter;
	
	@Autowired
	private PrivilegeService privilegeService;

	private static Logger logger = LogManager.getLogger(PrivilegeDto.class);

	// Get All Privilege
	@SuppressWarnings("static-access")
	public List<PrivilegeDto> getAllPrivilage() {
		logger.info("Privilege Mapper -> All Privilege Data Retrieved");
		List<Privilege> privilagelist = privilegeService.getAllPrivilege();
		return privilegeConverter.PrivilegeEntityToPrivilegeDTOList(privilagelist);
	}

	// Save Privilege
	@SuppressWarnings("static-access")
	public Privilege savePrivilege(PrivilegeDto privilegeDtO) {
		logger.info("New Privilege Successfully saved");
		return privilegeService.savePrivilege(privilegeConverter.PrivilegeDtoToPrivilege(privilegeDtO));
	}

	// Update Privilege
	@SuppressWarnings("static-access")
	public Privilege UpdatePrivilege(PrivilegeDto privilegeDto) {
		logger.info("Privilege is Updated", privilegeDto.getPrivilegeId());
		Privilege privilege = PrivilegeConverter.PrivilegeDtoToPrivilege(privilegeDto);
		return privilegeService.updatePrivilege(privilegeConverter.PrivilegeDtoToPrivilege(privilegeDto));
	}
	// Delete Privilege
	public PrivilegeDto deletePrivilegeById(String privilageId) {
		logger.info("Privilege Mapper -> Privilege Deleted");
		privilegeService.deletePrivilegeById(privilageId);
		return null;
	}

	 //Get Privilege By Id
	@SuppressWarnings("static-access")
	public PrivilegeDto getPrivilegeById(String privilageId) {
		logger.info("Privilege Mapper -> Privilege Id Found");
		Privilege privilege  = privilegeService.getPrivilegeById(privilageId);
		return privilegeConverter.PrivilageEntityTOPrivilegeDTO(privilege);
	}
}
