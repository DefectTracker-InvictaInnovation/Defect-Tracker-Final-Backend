package com.sgic.internal.defecttracker.defectservice.services.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.sgic.internal.defecttracker.defectservice.entities.ProjectType;
import com.sgic.internal.defecttracker.defectservice.repositories.ProjectTypeRepository;
import com.sgic.internal.defecttracker.defectservice.services.ProjectTypeService;

@Repository
public class ProjectTypeServiceImpl implements ProjectTypeService {

	@Autowired
	private ProjectTypeRepository projectTypeRepository;

	@Override
	public ProjectType createprojectType(ProjectType projectType) {
		return projectTypeRepository.save(projectType);
	}

	@Override
	public List<ProjectType> getallprojectType() {
		return projectTypeRepository.findAll();
	}

	@Override
	public ProjectType updateProjectType(ProjectType projectType) {
		Long projecttypeId = projectType.getProjecttypeId();
		boolean isExist = projectTypeRepository.findProjectTypeByProjecttypeId(projecttypeId) != null;
		if (isExist) {
			return projectTypeRepository.save(projectType);
		} else {

		}
		return null;
	}

	@Override
	public void deleteProjectType(Long projecttypeId) {
		projectTypeRepository.deleteById(projecttypeId);
	}

	@Override
	public ProjectType findByProjectTypeId(Long projecttypeId) {
		return projectTypeRepository.findProjectTypeByProjecttypeId(projecttypeId);
	}

}
