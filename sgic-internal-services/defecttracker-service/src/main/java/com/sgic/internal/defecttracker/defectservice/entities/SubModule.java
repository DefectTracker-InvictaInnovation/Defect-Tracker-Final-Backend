package com.sgic.internal.defecttracker.defectservice.entities;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Embeddable
@Entity
@Table(schema = "defectservices", name = "submodule")
public class SubModule {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long subModuleId;
	private String subModuleName;

	

	public Long getSubModuleId() {
		return subModuleId;
	}

	public void setSubModuleId(Long subModuleId) {
		this.subModuleId = subModuleId;
	}

	public String getSubModuleName() {
		return subModuleName;
	}

	public void setSubModuleName(String subModuleName) {
		this.subModuleName = subModuleName;
	}

	
	@Embedded
	@ManyToOne
	@JoinColumn(name = "moduleId", nullable = false)
	@JsonProperty(access = Access.WRITE_ONLY)
	private Module module;

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}
}
