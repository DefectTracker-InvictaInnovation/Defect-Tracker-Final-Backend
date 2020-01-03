package com.sgic.internal.defecttracker.defectservice.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sgic.internal.defecttracker.defectservice.entities.Module;
import com.sgic.internal.defecttracker.defectservice.entities.Project;

public interface ModuleRepository extends JpaRepository<Module, Long> {

	Module getByModuleId(Long moduleId);

//	@Query("SELECT  m.moduleName, s.subModuleName FROM Module m INNER JOIN SubModule s ON m.id = s.module.id WHERE m.project.id =:projectid")

	@Query(value = "FROM Module WHERE module_name= :moduleName")
	List<Module> getBymoduleName(@Param("moduleName") String moduleName);
//
	@Query("SELECT m FROM Module m WHERE m.project.id =:projectId")
	List<Module> getByProjectId(@Param("projectId") Long projectId);
	
//	List<Object> getSubmodule(@Param("projectid") String projectid);
	
//	@Query("SELECT m FROM Module m WHERE m.subModule.id =:subModuleId")
//	List<Module> getBySubModuleId(@Param("subModuleId") String subModuleId);

//	@Query("SELECT m FROM Module m WHERE m.subModule.id =:subModuleId")
//	List<Module>getBySubModuleId(@Param("subModuleId")String subModuleId);

	List<Module> findModuleByProject(Project project);

//	List<Module> findModuleBySubModule(SubModule subModule);


//	@Query("SELECT  m.moduleName, s.subModuleName FROM Module m INNER JOIN SubModule s ON m.id = s.module.id WHERE s.moduleId.id =:moduleId")
//	List<Object> getModuleBySubModuleId(@Param("moduleId") String moduleId);

//	List<Module> getBySubModuleId(String subModuleId);
	
	Module findAllmoduleByModuleId(Long moduleId);
	
	boolean existsByModuleName(String moduleName);
}
