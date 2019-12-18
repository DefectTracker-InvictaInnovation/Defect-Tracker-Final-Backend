package com.sgic.internal.defecttracker.defectservice.controller.dto;

import java.util.ArrayList;

public class StatusConfigDto {
	
	private Long statusId;
	private Long projectId;
	private ArrayList<String> statusList;
	
	public Long getStatusId() {
		return statusId;
	}
	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}
	public ArrayList<String> getStatusList() {
		return statusList;
	}
	public void setStatusList(ArrayList<String> statusList) {
		this.statusList = statusList;
	}
	public Long getProjectId() {
		return projectId;
	}
	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}
	
		
}
