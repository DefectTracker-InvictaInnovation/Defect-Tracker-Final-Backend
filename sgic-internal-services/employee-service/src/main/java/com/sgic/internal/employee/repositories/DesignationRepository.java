package com.sgic.internal.employee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.internal.employee.entities.Designation;

public interface DesignationRepository extends JpaRepository<Designation, Long> {

//	get by Designation Id Method
	public Designation findBydesignationid(Long designationid);

//	String fetchEmployeeByDesignation = "SELECT * FROM employee e WHERE e.designationid in (SELECT designationid from designation d where d.designationname=:designationname)";
//	@Query(value = fetchEmployeeByDesignation, nativeQuery = true)
//	<T> List<T> getEmployeeByDesigName(String designationname);

//	delete Designation method
	public void deleteDesignationBydesignationid(Long designationid);

}
