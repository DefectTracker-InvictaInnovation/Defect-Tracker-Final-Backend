package com.sgic.internal.employee.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sgic.internal.employee.entities.Designation;
import com.sgic.internal.employee.entities.Employee;

public interface DesignationRepository extends JpaRepository<Designation, Long> {

//	get by Designation Id Method
	public Designation findBydesignationid(Long designationid);

	String fetchHR = "SELECT * FROM designation  WHERE designationname=\"HR\" ";
	@Query(value = fetchHR, nativeQuery = true)
	List<Designation> getHr();

	String fetchQAAndDeveolersOnly = "SELECT * from designation d where d.designationname!=\"HR\"";
	@Query(value = fetchQAAndDeveolersOnly, nativeQuery = true)
	List<Designation> getQaAndDevelopers();
	
	
//	delete Designation method
	public void deleteDesignationBydesignationid(Long designationid);
	
}
