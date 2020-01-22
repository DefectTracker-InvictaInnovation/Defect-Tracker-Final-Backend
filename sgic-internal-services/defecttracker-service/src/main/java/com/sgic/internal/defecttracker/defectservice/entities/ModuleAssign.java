package com.sgic.internal.defecttracker.defectservice.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Convert;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sgic.internal.defecttracker.defectservice.controller.dto.converter.SubmoduleMapConverter;

@Entity
@Table(name = "module_assign")
public class ModuleAssign {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "moduleId", nullable = false)
	private Module module;

	@ManyToOne
	@JoinColumn(name = "projectId", nullable = false)
	private Project project;

	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	private ArrayList<Long> submoduleId;

	public ModuleAssign() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public ModuleAssign(Long id, Module module, Long projectId, ArrayList<Long> submoduleId) {
		super();
		this.id = id;
		this.module = module;
		this.project = project;
		this.submoduleId = submoduleId;
	}

	public ArrayList<Long> getSubmoduleId() {
		return submoduleId;
	}

	public void setSubmoduleId(ArrayList<Long> submoduleId) {
		this.submoduleId = submoduleId;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@Embedded
	@ManyToOne
	@JoinColumn(name = "projectrole_id", nullable = false)
	private ProjectRoleAllocation projectRoleAllocation;

	public ProjectRoleAllocation getProjectRoleAllocation() {
		return projectRoleAllocation;
	}

	public void setProjectRoleAllocation(ProjectRoleAllocation projectRoleAllocation) {
		this.projectRoleAllocation = projectRoleAllocation;
	}

}
