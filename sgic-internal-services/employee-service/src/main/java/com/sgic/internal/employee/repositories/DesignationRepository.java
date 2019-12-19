package com.sgic.internal.employee.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sgic.internal.employee.entities.Designation;

public interface DesignationRepository extends JpaRepository<Designation, Long> {
	
//	get by Designation Id Method
	public Designation findBydesignationid (Long designationid);
	
//	 // Find Employee By Designation Name
//	 @Query(value="SELECT e.name fROM employee e INNER JOIN designation d ON e.designationid=d.designationid", nativeQuery=true)
//	 List<Employee> getEmployeeByDesigName();
	
//	String fetchEmployeeByDesignation = "SELECT * FROM employee e WHERE e.designationid in (SELECT designationid from designation d where d.designationname=:designationname)";
//	@Query(value = fetchEmployeeByDesignation, nativeQuery = true)
//	<T> List<T> getEmployeeByDesigName(String designationname);
	
	
	String fetchEmployeeByDesignation = "SELECT * FROM employee e WHERE e.designationid in (SELECT designationid from designation d where d.designationname=\"PM\")";
	@Query(value = fetchEmployeeByDesignation, nativeQuery = true)
	<T> List<T> getEmployeeByDesigName();
	
//	delete Designation method
	public void deleteDesignationBydesignationid(Long designationid);

}
