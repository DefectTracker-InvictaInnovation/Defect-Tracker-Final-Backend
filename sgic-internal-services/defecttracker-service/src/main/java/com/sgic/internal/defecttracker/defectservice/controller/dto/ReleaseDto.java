package com.sgic.internal.defecttracker.defectservice.controller.dto;

import java.util.List;

public class ReleaseDto {
	
	private Long releaseId;
	private List<String> releaseName;
	
	private Long projectId;

	public Long getReleaseId() {
		return releaseId;
	}

	public void setReleaseId(Long releaseId) {
		this.releaseId = releaseId;
	}

	public List<String> getReleaseName() {
		return releaseName;
	}

	public void setReleaseName(List<String> releaseName) {
		this.releaseName = releaseName;
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}
	
	
	
	

}
