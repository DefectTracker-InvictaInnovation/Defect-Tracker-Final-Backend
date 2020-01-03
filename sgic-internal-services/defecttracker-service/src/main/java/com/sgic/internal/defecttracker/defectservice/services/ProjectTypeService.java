package com.sgic.internal.defecttracker.defectservice.services;

import java.util.List;
import com.sgic.internal.defecttracker.defectservice.entities.ProjectType;

public interface ProjectTypeService {

	public ProjectType createprojectType(ProjectType projectType);
	
	public List<ProjectType> getallprojectType();
	
	public ProjectType updateProjectType(ProjectType projectType);
	
	public void deleteProjectType(Long projecttypeId);
	
	public ProjectType findByProjectTypeId(Long projecttypeId);
	
}
