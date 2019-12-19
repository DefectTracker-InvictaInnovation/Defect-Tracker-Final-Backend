package com.sgic.internal.defecttracker.defectservice.controller.dto;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sgic.internal.defecttracker.defectservice.entities.SubModule;

@Component
public class ModuleData {
	private Long moduleId;
	private String moduleName;
	private Long projectId;
	private String projectName;
//	private String subModuleId;
//	private String subModuleName;
	private List<SubModule> subModule;
	
	public ModuleData(Long moduleId, String moduleName, Long projectId, String projectName ) {
		super();
		this.moduleId = moduleId;
		this.moduleName = moduleName;
		this.projectId = projectId;
		this.projectName =  projectName;
	}

	public ModuleData() {
	}

	// getters setters for module DTO
	

	public String getModuleName() {
		return moduleName;
	}

	public Long getModuleId() {
		return moduleId;
	}

	public void setModuleId(Long moduleId) {
		this.moduleId = moduleId;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;

	}

	// getter setter for submodule id
//	public String getSubModuleId() {
//		return subModuleId;
//	}
//
//	public void setSubModuleId(String subModuleId) {
//		this.subModuleId = subModuleId;
//	}
//
//	public String getSubModuleName() {
//		return subModuleName;
//	}
//
//	public void setSubModuleName(String subModuleName) {
//		this.subModuleName = subModuleName;
//	}

//	// getters setters for project id
	

	public String getProjectName() {
		return projectName;
	}

	

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<SubModule> getSubModule() {
		return subModule;
	}

	public void setSubModule(List<SubModule> subModule) {
		this.subModule = subModule;
	}
	
}
