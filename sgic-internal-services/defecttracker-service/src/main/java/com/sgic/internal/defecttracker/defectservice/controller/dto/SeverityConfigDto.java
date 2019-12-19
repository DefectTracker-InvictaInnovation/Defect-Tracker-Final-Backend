package com.sgic.internal.defecttracker.defectservice.controller.dto;

import java.util.ArrayList;

public class SeverityConfigDto {
	
	private Long severityId;
	private Long projectId;
	private ArrayList<String> severityList;
	
	public Long getSeverityId() {
		return severityId;
	}
	public void setSeverityId(Long severityId) {
		this.severityId = severityId;
	}
	public ArrayList<String> getSeverityList() {
		return severityList;
	}
	public void setSeverityList(ArrayList<String> severityList) {
		this.severityList = severityList;
	}
	public Long getProjectId() {
		return projectId;
	}
	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}
	
	
	
}
