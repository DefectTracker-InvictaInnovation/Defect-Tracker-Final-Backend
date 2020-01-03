package com.sgic.internal.defecttracker.defectservice.services;

public interface DashboardService {
	
	public Integer countseverity(Long projectId,String severity);
	
	
	public Integer countpriority(Long projectId,String priority);

	
	
	public Integer countopenseverity(Long projectId,String openseverity);
	
	public Integer countdefectByproject(Long projectId);


	public Float calculateSeverityIndex(Long projectId);

}
