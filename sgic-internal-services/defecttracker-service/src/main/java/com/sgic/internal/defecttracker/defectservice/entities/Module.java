package com.sgic.internal.defecttracker.defectservice.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Embeddable
@Entity
@Table(schema = "defectservices", name = "module")
public class Module {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long moduleId;
	private String moduleName;

//getters and setters for module
	

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

	// create relationship with project //
	@ManyToOne
	@JoinColumn(name = "projectid", nullable = false)
	private Project project;

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	// create relationship with SubModule //
	@OneToMany(mappedBy = "module", cascade = { CascadeType.ALL })
	public List<SubModule> subModule;

	public List<SubModule> getSubModule() {
		return subModule;
	}

	public void setSubModule(List<SubModule> subModule) {
		this.subModule = subModule;
	}

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "module")
	private ModuleAssign moduleAssign;
}
