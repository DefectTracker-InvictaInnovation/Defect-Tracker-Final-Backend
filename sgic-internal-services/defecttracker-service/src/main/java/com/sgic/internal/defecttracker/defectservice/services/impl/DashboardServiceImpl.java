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

}
