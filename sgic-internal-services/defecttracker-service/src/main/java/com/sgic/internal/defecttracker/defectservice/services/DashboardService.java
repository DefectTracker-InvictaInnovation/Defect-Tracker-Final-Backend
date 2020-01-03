package com.sgic.internal.defecttracker.defectservice.services;

public interface DashboardService {

//	<----Calculate severity Low defect --- Method--- >
	public float CalculateLow(long count, int reject, int low, int rejectlow);



	//<----Calculate severity high defect --- Method--- >
	public float Calculatseverityhigh(long count, int reject, int High, int rejectHigh);

	public Integer countseveritylow();

	public Integer countseveritymudium();

	public Integer countseverityHigh();

	public Integer countseverityReject();

	//	<----Calculate severity medium defect --- Method--- >
	public float CalculateMedium(long count, int reject, int medium, int rejectmedium);
	
	//For Severity Index 
	public Integer countLow();
	
	public Integer countMedium();
	
	public Integer countHigh();	
	
	public Integer countReject();
	
	public Long TotalCount();

//	<--Severity Total Count -->
	public Integer countseveritytotalLow(long countseveritylow, int rejectseveritylow);
	
//	<--Severity Total Count -->
	public Integer countseveritytotalmedium(long countseveritymedium, int rejectseveritymedium);
	
//	<--Severity Total Count -->
	public Integer countseveritytotalhig(long countseverityhigh, int rejectseverityhigh);
	
	public Double calculatedefectRemarksratio(long count, int reject);
	
	public Integer countprioritytotalmedium(long countprioritymedium, int rejectprioritymedium);
	
	public Integer countprioritytotalhigh(long countpriorityhigh, int rejectpriorityhigh);
	
	public Integer countprioritytotallow(long countprioritylow, int rejectprioritylow);
	
	//Severity Index Matrix
	public Float calculateSeverityIndex(Long projectId);
	
}
