package com.sgic.internal.defecttracker.defectservice.services;

import java.util.List;

import com.sgic.internal.defecttracker.defectservice.entities.SubModule;

public interface SubModuleService {

	public SubModule createSubModule(SubModule subModule);

	public boolean isSubModuleAlreadyExists(Long subModuleId);

	public List<SubModule> getallDetails();

	public void deleteSubModuleById(Long subModuleId);

	public SubModule updateSubModule(Long subModuleId, SubModule subModule);

	public SubModule getBySubModuleId(Long subModuleId);
	
	public List<SubModule> getByabbre(String abbre);

	public List<SubModule> getBysubModuleName(String subModuleName);
	
	public List<SubModule> getByModuleId(Long moduleId);
}
