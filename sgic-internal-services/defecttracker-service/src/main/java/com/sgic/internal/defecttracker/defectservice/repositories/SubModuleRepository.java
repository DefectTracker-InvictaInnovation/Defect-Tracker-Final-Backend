package com.sgic.internal.defecttracker.defectservice.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import com.sgic.internal.defecttracker.defectservice.controller.dto.SubModuleData;
import com.sgic.internal.defecttracker.defectservice.entities.Module;
import com.sgic.internal.defecttracker.defectservice.entities.SubModule;

public interface SubModuleRepository extends JpaRepository<SubModule, Long> {

	SubModule getBySubModuleId(Long subModuleId);

	List<SubModule> findModuleBysubModuleId(Module module);

	@Query(value = "FROM SubModule WHERE sub_module_name= :subModuleName")
	List<SubModule> getBysubModuleName(@Param("subModuleName") String subModuleName);

	List<SubModule> findSubModuleByModule(Module module);
	
	@Query(value = "FROM SubModule WHERE module_id= :moduleId")
	List<SubModule> getByModuleName(@PathVariable(name="moduleId") Long moduleId);
}
