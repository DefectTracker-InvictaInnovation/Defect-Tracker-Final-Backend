package com.sgic.internal.defecttracker.defectservice.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.sgic.internal.defecttracker.defectservice.entities.ProjectRoleAllocation;

public interface ProjectRoleAllocationRepository extends JpaRepository<ProjectRoleAllocation, Long> {

	ProjectRoleAllocation findProjectRoleAllocationByprojectroleId(Long projectroleId);
	
	@Transactional
	@Modifying
	@Query(value = "DELETE FROM ProjectRoleAllocation WHERE projectrole_id =:projectroleId")
	void deleteByProjectId(@Param("projectroleId") Long projectroleId);

	@Transactional
	@Modifying
	@Query(value = "from ProjectRoleAllocation where resource_id=:resourceId")
	List<ProjectRoleAllocation> getResourceById(@Param("resourceId") Long resourceId);
	
	
	String fetchAllQaAndDev = "select * from resource_allocation where resource_id in (select resource_id from assign_role where role_id in (select role_id from role where role_name!=PM and role_name!=HR ))";
	@Query(value = fetchAllQaAndDev, nativeQuery = true)
	List<ProjectRoleAllocation> findQaAndDev();
}
