package com.sgic.internal.defecttracker.defectservice.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

import com.sgic.internal.defecttracker.defectservice.entities.ModuleAssign;


public interface ModuleAssignRepository extends JpaRepository<ModuleAssign, Long> {
	// Find Employee By Designation Name
		

	@Query(value = "SELECT submoduleId FROM ModuleAssign WHERE module_id= :moduleId")
	ArrayList<String> getSubModule(@PathVariable(name="moduleId") Long moduleId);

}
