package com.sgic.internal.defecttracker.defectservice.services;

public interface DashboardService {
	
	public Integer countseverity(Long projectId,String severity);
	
	
	public Integer countpriority(Long projectId,String priority);

}
