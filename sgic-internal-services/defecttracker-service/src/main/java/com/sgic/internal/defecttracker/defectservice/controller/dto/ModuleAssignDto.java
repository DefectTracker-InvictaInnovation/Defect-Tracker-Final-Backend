package com.sgic.internal.defecttracker.defectservice.controller.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ModuleAssignDto {
	private Long id;
	private Long projectId;
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	private ArrayList<Long> submoduleId;
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

	public ArrayList<Long> getSubmoduleId() {
		return submoduleId;
	}

	public void setSubmoduleId(ArrayList<Long> submoduleId) {
		this.submoduleId = submoduleId;
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