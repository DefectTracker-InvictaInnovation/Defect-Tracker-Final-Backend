package com.sgic.internal.defecttracker.defectservice.controller.dto;

import org.springframework.stereotype.Component;

@Component
public class SubModuleData {

	private Long subModuleId;
	private String subModuleName;
	private Long moduleId;
	private Long projectId;

	
	public SubModuleData(Long subModuleId, String subModuleName) {
		super();
		this.subModuleId = subModuleId;
		this.subModuleName = subModuleName;
	}

	public SubModuleData() {
		// TODO Auto-generated constructor stub
	}

	

	public Long getSubModuleId() {
		return subModuleId;
	}

	public void setSubModuleId(Long subModuleId) {
		this.subModuleId = subModuleId;
	}

	public Long getModuleId() {
		return moduleId;
	}

	public void setModuleId(Long moduleId) {
		this.moduleId = moduleId;
	}

	// Getters and Setters for Sub Module
	

	public String getSubModuleName() {
		return subModuleName;
	}

	public void setSubModuleName(String subModuleName) {
		this.subModuleName = subModuleName;
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	


}
