package com.sgic.internal.defecttracker.defectservice.controller.dto.mapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.internal.defecttracker.defectservice.controller.dto.converter.SubModuleConverter;
import com.sgic.internal.defecttracker.defectservice.controller.dto.SubModuleData;
import com.sgic.internal.defecttracker.defectservice.entities.SubModule;
import com.sgic.internal.defecttracker.defectservice.services.SubModuleService;

@Service
public class SubModuleDataMapper {
	@Autowired
	public SubModuleService subModuleService;

	public List<SubModuleData> getAllSubModuleForMapper() {
		List<SubModule> subModuleList = subModuleService.getallDetails();
		return SubModuleConverter.subModuleToSubModuleData(subModuleList);
	}

	public SubModule saveSubModuleforMapper(SubModuleData subModuleData) {
		SubModule subModule = SubModuleConverter.subModuleDataToSubModule(subModuleData);
		return subModuleService.createSubModule(subModule);
	}

	public SubModuleData getBySubModuleId(Long subModuleId) {
		SubModule subModule = subModuleService.getBySubModuleId(subModuleId);
		return SubModuleConverter.subModuleToSubModuleData(subModule);
	}

	public List<SubModuleData> getBysubModuleNameForMapper(String subModuleName) {
		List<SubModule> subModule = subModuleService.getBysubModuleName(subModuleName);
		return SubModuleConverter.subModuleToSubModuleData(subModule);

	}

	public SubModule UpdateSubModule(Long subModuleId, SubModuleData subModuleData) {
		SubModule subModule = SubModuleConverter.subModuleDataToSubModule(subModuleData);
		return subModuleService.updateSubModule(subModuleId, subModule);

	}

	public void deleteSubModuleById(Long subModuleId) {
		subModuleService.deleteSubModuleById(subModuleId);
		
	}
	

}