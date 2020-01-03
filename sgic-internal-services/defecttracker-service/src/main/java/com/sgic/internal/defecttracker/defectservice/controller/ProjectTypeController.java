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
import com.sgic.internal.defecttracker.defectservice.entities.ProjectType;
import com.sgic.internal.defecttracker.defectservice.services.ProjectTypeService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ProjectTypeController {

	@Autowired
	private ProjectTypeService projectTypeService;

	@PostMapping("/saveprojecttype")
	public ProjectType saveprojecttype(@RequestBody ProjectType projectType) {
		return projectTypeService.createprojectType(projectType);
	}

	@GetMapping("/getallprojecttype")
	public List<ProjectType> getallprojecttype() {
		return projectTypeService.getallprojectType();
	}

	@PutMapping("updateprojecttype/{projecttypeId}")
	public ResponseEntity<String> updateProjectType(@RequestBody ProjectType projectType) {
		try {
			if (projectTypeService.updateProjectType(projectType) != null) {
				return new ResponseEntity<>("Successfully Updated", HttpStatus.OK);
			}
			return new ResponseEntity<>("Failed To Update", HttpStatus.OK);
		} catch (Exception ex) {

		}

		return null;
	}

	@DeleteMapping("/deleteprojecttype/{projecttypeId}")
	public ResponseEntity<String> deleteProjectType(@PathVariable("projecttypeId") Long projecttypeId) {
		try {
			projectTypeService.deleteProjectType(projecttypeId);
			return new ResponseEntity<>("Deleted Successfully", HttpStatus.OK);
		} catch (Exception ex) {

		}
		return null;
	}
	
	@GetMapping("/getprojecttypeId/{projecttypeId}")
	public ResponseEntity<ProjectType> getProjectTypeById(@PathVariable(name = "projecttypeId") Long projecttypeId) {
		return new ResponseEntity<ProjectType>(projectTypeService.findByProjectTypeId(projecttypeId),HttpStatus.OK) ;	
	}
	
	
}
