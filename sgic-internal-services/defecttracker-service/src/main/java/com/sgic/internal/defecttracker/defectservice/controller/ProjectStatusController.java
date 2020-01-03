package com.sgic.internal.defecttracker.defectservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sgic.internal.defecttracker.defectservice.entities.ProjectStatus;
import com.sgic.internal.defecttracker.defectservice.services.ProjectStatusService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ProjectStatusController {
	
	@Autowired
	private ProjectStatusService projectStatusService;
	
	@PostMapping("/saveprostatus")
	public ProjectStatus saveprojectStatus(@RequestBody ProjectStatus projectStatus) {
		return projectStatusService.createProjectStatus(projectStatus);
	}
	
	@GetMapping("/getallprostatus")
	public List<ProjectStatus> getallprojectstatus(){
		return projectStatusService.getAllProjectStatus();
	}
	
	@PutMapping("updateprojectstatus/{projectstatusId}")
	public ResponseEntity<String> updateProjectStatus(@RequestBody ProjectStatus projectStatus) {
		try {
			if (projectStatusService.updateProjectStatus(projectStatus) != null) {
				return new ResponseEntity<>("Successfully Updated", HttpStatus.OK);
			}
			return new ResponseEntity<>("Failed To Update", HttpStatus.OK);
		} catch (Exception ex) {

		}

		return null;
	}

	@DeleteMapping("/deleteprojectstatus/{projectstatusId}")
	public ResponseEntity<String> deleteProjectStatus(@PathVariable("projectstatusId") Long projectstatusId) {
		try {
			projectStatusService.deleteProjectStatus(projectstatusId);
			return new ResponseEntity<>("Deleted Successfully", HttpStatus.OK);
		} catch (Exception ex) {

		}
		return null;
	}
	
	@GetMapping("/getprojectstatusId/{projectstatusId}")
	public ResponseEntity<ProjectStatus> getProjectStatusById(@PathVariable(name = "projectstatusId") Long projectstatusId) {
		return new ResponseEntity<ProjectStatus>(projectStatusService.findByProjectStatusId(projectstatusId),HttpStatus.OK) ;	
	}
}
