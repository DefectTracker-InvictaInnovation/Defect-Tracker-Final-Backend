package com.sgic.internal.defecttracker.defectservice.controller.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ReleaseDto {
	
	private Long releaseId;
	
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	private ArrayList<String> releaseName;
	
	private Long projectId;

	public Long getReleaseId() {
		return releaseId;
	}

	public void setReleaseId(Long releaseId) {
		this.releaseId = releaseId;
	}

	

	public ArrayList<String> getReleaseName() {
		return releaseName;
	}

	public void setReleaseName(ArrayList<String> releaseName) {
		this.releaseName = releaseName;
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}
	
	
	
	

}
