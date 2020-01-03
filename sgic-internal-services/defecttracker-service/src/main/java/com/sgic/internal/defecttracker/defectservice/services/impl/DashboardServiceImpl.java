package com.sgic.internal.defecttracker.defectservice.services.impl;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.internal.defecttracker.defectservice.repositories.DefectRepository;
import com.sgic.internal.defecttracker.defectservice.services.DashboardService;

@Service
public class DashboardServiceImpl implements DashboardService{
	
	@Autowired
	private DefectRepository defectRepository;

	private static Logger logger = LogManager.getLogger(DashboardService.class);
	
	
	
	@Override
	public Integer countseverity(Long projectId, String severity) {
		
		return defectRepository.countBySeverity(projectId, severity);
	}



	@Override
	public Integer countpriority(Long projectId, String priority) {
		
		return defectRepository.countByPriority(projectId, priority);
	}



	@Override
	public Integer countopenseverity(Long projectId, String openseverity) {
		
		return defectRepository.countByOpenSeverity(projectId, openseverity);
	}



	@Override
	public Integer countdefectByproject(Long projectId) {
		
		return defectRepository.countdefectByProject(projectId);
	}
	
	//severity index
	@Override
	public Float calculateSeverityIndex(Long projectId) {
		long countSeverityHigh = defectRepository.siCountDefectByRejectedStatusAndSeverityHigh(projectId);
		long countSeverityLow = defectRepository.siCountDefectByRejectedStatusAndSeverityLow(projectId);
		long countSeverityMedium = defectRepository.siCountDefectByRejectedStatusAndSeverityMedium(projectId);
		long countSeverityTotal = defectRepository.siCountDefectByProject(projectId);
		
		long lowWeight = defectRepository.getLowWeight();
		long highWeight = defectRepository.getHighWeight();
		long mediumWeight = defectRepository.getMediumWeight();

		long severityIndexinInt = ((countSeverityHigh* highWeight) + (countSeverityMedium * mediumWeight)
				+ (countSeverityLow * lowWeight))/countSeverityTotal;
		float severityIndex = severityIndexinInt;
		System.out.println(severityIndex);
		return severityIndex;
	}

}
