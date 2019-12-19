package com.sgic.internal.defecttracker.defectservice.controller.dto;

import java.util.List;

public class ModuleAssignDto {
	private Long id;
	private Long projectId;
	private List<Long> submoduleId;
//	private Long submoduleId;
	
	
	
	private String submoduleName;
	private Long moduleId;
	private String moduleName;
	private Long projectroleId;
	
	public Long getProjectroleId() {
		return projectroleId;
	}
	public void setProjectroleId(Long projectroleId) {
		this.projectroleId = projectroleId;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getProjectId() {
		return projectId;
	}
	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	
	public String getSubmoduleName() {
		return submoduleName;
	}
	public void setSubmoduleName(String submoduleName) {
		this.submoduleName = submoduleName;
	}
	
	
	
	
//	public List<Long> getSubmoduleId() {
//		return submoduleId;
//	}
//	public void setSubmoduleId(List<Long> submoduleId) {
//		this.submoduleId = submoduleId;
//	}
	public Long getModuleId() {
		return moduleId;
	}
	
	public List<Long> getSubmoduleId() {
		return submoduleId;
	}
	public void setSubmoduleId(List<Long> submoduleId) {
		this.submoduleId = submoduleId;
	}
	public void setModuleId(Long moduleId) {
		this.moduleId = moduleId;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
}
