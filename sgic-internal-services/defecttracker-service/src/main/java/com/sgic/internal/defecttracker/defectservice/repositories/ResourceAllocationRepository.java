package com.sgic.internal.defecttracker.defectservice.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sgic.internal.defecttracker.defectservice.entities.ProjectRoleAllocation;
import com.sgic.internal.defecttracker.defectservice.entities.ResourceAllocation;

public interface ResourceAllocationRepository extends JpaRepository<ResourceAllocation, Long> {

//	<---Get Resource By Id Method--->
	ResourceAllocation findResourceAllocationByresourceId(Long resourceId);
	

//	<---Custom Query -- use to list Resource by Resource Id --->
	String fetchAllresourceId = "SELECT resource_id FROM resource_allocation";

	@Query(value = fetchAllresourceId, nativeQuery = true)
	<T> List<T> getAllresourceId();

//	<---save Bulk Method  --->
	List<ResourceAllocation> save(List<ResourceAllocation> resourceAllocation);

	@Query(value = "from ResourceAllocation where empId=:empId")
	List<ResourceAllocation> findResourceAllocationByempId(Long empId);

	@Query("SELECT SUM(availability) FROM ResourceAllocation WHERE empId=:empId")
	Long AvailabileSum(Long empId);
	
	@Query(value = "from ResourceAllocation where project_id=:projectId")
	List<ResourceAllocation> findResourceAllocationByprojectId(Long projectId);
	
	String fetchAllQaAndDev = "select * from defectservices.resource_allocation where emp_id in (select emp_id from employeeservice.employee where availability>0 and designationid in (select designationid from employeeservice.designation where designationname!=\"PM\" and designationname!=\"HR\" ))";
	@Query(value = fetchAllQaAndDev, nativeQuery = true)
	List<ResourceAllocation> findQaAndDev();

}
