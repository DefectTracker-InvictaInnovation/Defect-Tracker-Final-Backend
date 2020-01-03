package com.sgic.internal.defecttracker.defectservice.services.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.internal.defecttracker.defectservice.repositories.DefectRepository;
import com.sgic.internal.defecttracker.defectservice.services.OldDashboardService;

@Service
public class OldDashboardServiceImpl implements OldDashboardService {

	@Autowired
	private DefectRepository defectRepository;

	private static Logger logger = LogManager.getLogger(OldDashboardService.class);

	@Override
	public float CalculateLow(long count, int reject, int low, int rejectlow) {
		// int count1 = (int)count;
		count = (int) defectRepository.count();
		System.out.println(count);
		reject = defectRepository.countByStatusRejected();
		System.out.println(reject);
		//low = defectRepository.countBySeverity();
		System.out.println(low);
		rejectlow = defectRepository.countByStatusRejectedlow();
		System.out.println(rejectlow);
		int c = (int) (count - reject);
		System.out.println(c);
		int d = (int) (low - rejectlow);
		System.out.println(d);
		float LowSeverity = (d * 100 / c);
		System.out.println(LowSeverity);
		return LowSeverity;
	}

	// For Severity Index start
	//public Integer countLow() {
	//	return defectRepository.countBySeverity();
	//}

	@Override
	public Integer countMedium() {
		return defectRepository.countBySeverityMedium();
	}

	@Override
	public Integer countHigh() {
		return defectRepository.countBySeverityhigh();
	}

	@Override
	public Integer fetchHighWeight() {
		return defectRepository.getHighWeight();
	}

	@Override
	public Integer fetchMediumWeight() {
		return defectRepository.getMediumWeight();
	}

	@Override
	public Integer fetchLowWeight() {
		return defectRepository.getLowWeight();
	}

	@Override
	public Long TotalCount() {
		return defectRepository.count();
	}

	@Override
	public Double calculateSeverityIndex() {
		 
		int countLow = countLow() - lowReject();
		int countMedium = countMedium() - mediumReject();
		int countHigh = countHigh()-  highReject();
		int fetchHighWeight = fetchHighWeight();
		int fetchMediumWeight = fetchMediumWeight();
		int fetchLowWeight = fetchLowWeight();
		long totalCount = TotalCount() - countReject();

		int severityIndex1 = ((countHigh* fetchHighWeight) + (countMedium * fetchMediumWeight)
				+ (countLow * fetchLowWeight));
		double severityIndex1d = severityIndex1;

		int totcount = (int) totalCount;
		double totcountd = totcount;

		double severityIndex = severityIndex1d / totcountd;
		return severityIndex;
	}

	public Integer countReject() {
		return defectRepository.countByStatusRejected();
	}
	
	public Integer mediumReject() {
		return defectRepository.countByStatusRejectedmedium();
	}
	public Integer lowReject() {
		return defectRepository.countByStatusRejectedlow();
	}
	public Integer highReject() {
		return defectRepository.countByStatusRejectedHigh();
	}
	
	// For Severity Index End

	public float CalculateMedium(long count, int reject, int medium, int rejectmedium) {
		// int count1 = (int)count;
		count = (int) defectRepository.count();
		System.out.println(count);
		reject = defectRepository.countByStatusRejected();
		System.out.println(reject);
		medium = defectRepository.countBySeverityMedium();
		System.out.println(medium);
		rejectmedium = defectRepository.countByStatusRejectedmedium();
		System.out.println(rejectmedium);
		int c = (int) (count - reject);
		System.out.println(c);
		int d = (int) (medium - rejectmedium);
		System.out.println(d);
		float MediumSeverity = (d * 100 / c);
		System.out.println(MediumSeverity);
		return MediumSeverity;
	}

	@Override
	public float Calculatseverityhigh(long count, int reject, int High, int rejectHigh) {

		count = (int) defectRepository.count();
		System.out.println(count);

		reject = defectRepository.countByStatusRejected();
		System.out.println(reject);

		High = defectRepository.countBySeverityhigh();
		System.out.println(High);

		rejectHigh = defectRepository.countByStatusRejectedHigh();
		System.out.println(rejectHigh);

		int c = (int) (count - reject);
		System.out.println(c);

		int d = (int) (High - rejectHigh);
		System.out.println(d);

		float HighSeverity = (d * 100 / c);
		System.out.println(HighSeverity);
		return HighSeverity;

	}

	@Override
	public Integer countseveritylow() {
		return defectRepository.countBySeverityhigh();
	}

	@Override
	public Integer countseveritymudium() {
		return defectRepository.countBySeverityMedium();
	}

	@Override
	public Integer countseverityHigh() {
		return defectRepository.countBySeverityhigh();
	}

	@Override
	public Integer countseverityReject() {
		return defectRepository.countByStatusRejected();
	}

//	<--Total Severity Low Defect Count method--->
	@Override
	public Integer countseveritytotalLow(long countseveritylow, int rejectseveritylow) {
		//countseveritylow = (int) defectRepository.countBySeverity();
		rejectseveritylow = (int) defectRepository.countByStatusRejectedlow();
		
		int totalseveritylow =(int) ( countseveritylow - rejectseveritylow);
		return totalseveritylow;
	}

//	<--Total Severity High Defect Count method--->
	@Override
	public Integer countseveritytotalhig(long countseverityhigh, int rejectseverityhigh) {
		countseverityhigh = (int) defectRepository.countBySeverityhigh();
		rejectseverityhigh = (int) defectRepository.countByStatusRejectedHigh();
		
		int totalseverityhigh =(int) ( countseverityhigh - rejectseverityhigh);
		return totalseverityhigh;
	}

//	<--Total Severity medium Defect Count method--->
	@Override
	public Integer countseveritytotalmedium(long countseveritymedium, int rejectseveritymedium) {
		
		countseveritymedium = (int) defectRepository.countBySeverityMedium();
		rejectseveritymedium = (int) defectRepository.countByStatusRejectedmedium();
		
		int totalseveritymedium =(int) ( countseveritymedium - rejectseveritymedium);
		return totalseveritymedium;
	}

	@Override
	public Double calculatedefectRemarksratio(long count, int reject) {
		count = (int) defectRepository.count();
		System.out.println(count);
		reject = defectRepository.countByStatusRejected();
		System.out.println(reject);
		double c = (count - reject);
		System.out.println(c);
		double r = (double) c/(double)count;
		System.out.println(r);
		double totalratio = (double) (r*0.01);
	    System.out.println(totalratio);
		return totalratio;
	}

	@Override
	public Integer countprioritytotalmedium(long countprioritymedium, int rejectprioritymedium) {
		countprioritymedium = (int) defectRepository.countByPriorityMedium();
		rejectprioritymedium = (int) defectRepository.countByPriorityStatusRejectedmedium();
		
		int totalprioritymedium =(int) ( countprioritymedium - rejectprioritymedium);
		return totalprioritymedium;
	}

	@Override
	public Integer countprioritytotalhigh(long countpriorityhigh, int rejectpriorityhigh) {
		countpriorityhigh = (int) defectRepository.countByPriorityHigh();
		rejectpriorityhigh = (int) defectRepository.countByPriorityStatusRejectedhigh();
		
		int totalpriorityhigh =(int) ( countpriorityhigh - rejectpriorityhigh);
		return totalpriorityhigh;
	}

	@Override
	public Integer countprioritytotallow(long countprioritylow, int rejectprioritylow) {
		countprioritylow = (int) defectRepository.countByPriorityLow();
		rejectprioritylow = (int) defectRepository.countByPriorityStatusRejectedlow();
		
		int totalprioritylow =(int) ( countprioritylow - rejectprioritylow);
		return totalprioritylow;
	}

	@Override
	public Integer countLow() {
		// TODO Auto-generated method stub
		return null;
	}

}
