package com.sgic.internal.defecttracker.defectservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.internal.defecttracker.defectservice.repositories.DefectRepository;
import com.sgic.internal.defecttracker.defectservice.services.DashboardService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@SuppressWarnings("unused")
@RestController
//@RequestMapping("/dashboard")
public class DashboardController {
	@Autowired
	private DashboardService dashboardService;

	@Autowired
	private DefectRepository defectRepo;
	
	@GetMapping("/getseveritycount/{projectId}&{severity}")
	public ResponseEntity<Integer> countseveritytotalmedium(@PathVariable(name="projectId") Long projectId,@PathVariable(name="severity") String severity) {
		return new ResponseEntity<>(dashboardService.countseverity(projectId, severity),HttpStatus.OK );
	}
	
	@GetMapping("/getprioritycount/{projectId}&{priority}")
	public ResponseEntity<Integer> countprioritytotalmedium(@PathVariable(name="projectId") Long projectId,@PathVariable(name="priority") String priority) {
		return new ResponseEntity<>(dashboardService.countpriority(projectId, priority),HttpStatus.OK );
	}
}
