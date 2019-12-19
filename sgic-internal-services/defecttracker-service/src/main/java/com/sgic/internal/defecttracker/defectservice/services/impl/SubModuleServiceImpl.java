package com.sgic.internal.defecttracker.defectservice.services.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.internal.defecttracker.defectservice.entities.SubModule;
import com.sgic.internal.defecttracker.defectservice.repositories.SubModuleRepository;
import com.sgic.internal.defecttracker.defectservice.services.SubModuleService;

@Service
public class SubModuleServiceImpl implements SubModuleService {

	@Autowired
	private SubModuleRepository subModuleRepository;

	@Override
	public SubModule createSubModule(SubModule subModule) {
		SubModule responseSubModule = subModuleRepository.save(subModule);
		return responseSubModule;
	}

	@Override
	public boolean isSubModuleAlreadyExists(Long subModuleId) {
		return subModuleRepository.existsById(subModuleId);
	}

	@Override
	public List<SubModule> getallDetails() {
		return subModuleRepository.findAll();
	}

	@Override
	public void deleteSubModuleById(Long subModuleId) {
		subModuleRepository.deleteById(subModuleId);

	}

	@Override
	public SubModule updateSubModule(Long subModuleId, SubModule subModule) {
		if (subModuleRepository.getOne(subModuleId) != null) {
			subModule.setSubModuleId(subModuleId);
			subModuleRepository.save(subModule);
		}
		return subModule;
	}

	@Override
	public SubModule getBySubModuleId(Long subModuleId) {
		return subModuleRepository.getBySubModuleId(subModuleId);
	}

	@Override
	public List<SubModule> getBysubModuleName(String subModuleName) {
		return subModuleRepository.getBysubModuleName(subModuleName);
	}

	@Override
	public List<SubModule> getByabbre(String abbre) {
		return null;
	}


}
