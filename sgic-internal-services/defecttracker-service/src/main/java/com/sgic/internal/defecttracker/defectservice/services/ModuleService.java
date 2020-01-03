package com.sgic.internal.defecttracker.defectservice.services;

import java.util.List;

import com.sgic.internal.defecttracker.defectservice.entities.Module;


public interface ModuleService {

	public Module createModule(Module module);

	public boolean isModuleAlreadyExists(Long moduleId);

	public List<Module> getallModuleDetails(Long projectid);

	public void deleteByModuleId(Long moduleId);

	public Module updateModule(Long moduleId, Module module);

	Module getByModuleId(Long moduleId);

	public List<Module> getBymoduleName(String moduleName);

	// service for get project id
	public List<Module> getByprojectId(Long projectid);

	List<Module> getallDetails(Long moduleId);
	
	Module getByallModuleId(Long moduleId);
	
	public Module moduleUpdate(Module module);

	// List Module Info
	public List<Module> findByModuleOrderByModuleIdDesc(Long moduleId);
	
	public boolean isModuleNameAlreadyExist(String moduleName);
}
