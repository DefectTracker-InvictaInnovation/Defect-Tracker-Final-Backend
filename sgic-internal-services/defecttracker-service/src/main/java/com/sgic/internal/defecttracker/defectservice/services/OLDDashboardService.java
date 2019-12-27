package com.sgic.internal.defecttracker.defectservice.services;

public interface OLDDashboardService {

	public Integer countseverity(Long projectId);

//	public Integer countlow();
//
//	public Integer countmudium();

//	public Integer countHigh();
//
//	public Integer countReject();


	

	public Integer countseveritylow(Long projectId);

	public Integer countseveritymudium();

	public Integer countseverityHigh();

	public Integer countseverityReject();
	
	
	//<----Calculate severity high defect --- Method--- >
		public float CalculatSeverityhigh(long count, int reject, int High, int rejectHigh);
			
	//	<----Calculate severity medium defect --- Method--- >
		public float CalculateSeverityMedium(long count, int reject, int medium, int rejectmedium);
	
	//	<----Calculate severity Low defect --- Method--- >
		public float CalculateSeverityLow(long count, int reject, int low, int rejectlow);

	
	
	
	//For Severity Index 
	public Integer countLow();
	
	public Integer countMedium();
	
	public Integer countHigh();	
	
	public Integer countReject();
	
	public Integer fetchHighWeight();
	
	public Integer fetchMediumWeight();
	
	public Integer fetchLowWeight();
	
	public Long TotalCount();
	
	public Double calculateSeverityIndex();
	
	

//	<--Severity Total Count -->
	
	
	public Integer countseveritytotalLow(long countseveritylow, int rejectseveritylow);
	
	public Integer countseveritytotalmedium(long countseveritymedium, int rejectseveritymedium);
	
	public Integer countseveritytotalhigh(long countseverityhigh, int rejectseverityhigh);
	
	
	
//	<!--priority Total Count -->
	public Integer countprioritytotalmedium(long countprioritymedium, int rejectprioritymedium);
	
	public Integer countprioritytotalhigh(long countpriorityhigh, int rejectpriorityhigh);
	
	public Integer countprioritytotallow(long countprioritylow, int rejectprioritylow);
	
	
	//
	public Double calculatedefectRemarksratio(long count, int reject);

	float CalculateLow(long count, int reject, int low, int rejectlow);
	
}
