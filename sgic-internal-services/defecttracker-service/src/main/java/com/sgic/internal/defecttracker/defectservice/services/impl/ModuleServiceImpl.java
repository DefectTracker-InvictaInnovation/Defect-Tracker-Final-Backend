package com.sgic.internal.defecttracker.defectservice.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.sgic.internal.defecttracker.defectservice.entities.Module;
import com.sgic.internal.defecttracker.defectservice.repositories.ModuleRepository;
import com.sgic.internal.defecttracker.defectservice.services.ModuleService;

@Service
public class ModuleServiceImpl implements ModuleService {

	@Autowired
	private ModuleRepository moduleRepository;

	@Override
	public Module createModule(Module module) {
		Module responseModule = moduleRepository.save(module);
		return responseModule;
	}

	@Override
	public void deleteById(Long moduleId) {
		moduleRepository.deleteById(moduleId);

	}

	@Override
	public Module getByModuleId(Long moduleId) {
		return moduleRepository.getByModuleId(moduleId);
	}


	
	@Override
	public Module updateModule(Long moduleId, Module module) {
		if (moduleRepository.findAll() != null) {
			module.setModuleId(moduleId);
			moduleRepository.save(module);
		}
		return module;
	}

	@Override
	public boolean isModuleAlreadyExists(Long moduleId) {
		return moduleRepository.existsById(moduleId);
	}

	@Override
	public List<Module> getByprojectId(Long projectid) {
		return moduleRepository.getByProjectId(projectid);
	}

//	@Override
//	public List<Object> getSubmodule(String subModuleId) {
//		return moduleRepository.getSubmodule(subModuleId);
//	}

	@Override
	public List<Module> getBymoduleName(String moduleName) {
		return moduleRepository.getBymoduleName(moduleName);
	}

	

	@Override
	public List<Module> getallDetails(Long moduleId) {
		return moduleRepository.findAll(Sort.by(Sort.Direction.DESC, "moduleId"));
	}

	@Override
	public List<Module> getallModuleDetails(Long projectid) {
		return moduleRepository.findAll();
	}

	@Override
	public Module getByallModuleId(Long moduleId) {
		return moduleRepository.findAllmoduleByModuleId(moduleId);
	}

	@Override
	public Module moduleUpdate(Module module) {
		Long moduleId = module.getModuleId();
		boolean isExist = moduleRepository.findAllmoduleByModuleId(moduleId) != null;
		if (isExist) {
			return moduleRepository.save(module);
		} else {
		}

		return null;
	}

	@Override
	public List<Module> findByModuleOrderByModuleIdDesc(Long moduleId) {
		return moduleRepository.findAll(Sort.by(Sort.Direction.DESC, "moduleId"));
	}

//	@Override
//	public List<Module> findByModuleOrderByModuleIdDesc(Long moduleId) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
