package com.sgic.internal.employee.services;

import java.util.List;
import com.sgic.internal.employee.entities.Designation;
import com.sgic.internal.employee.entities.Employee;

public interface DesignationService {

	//	Save method for Designation Method
	public Designation savedesignation(Designation designation);

	//	Get List from Designation Table Method
	public List<Designation> getAllDesignation();

	//	Get Designation by Designation Id Method
	public Designation getBydesignationid(Long designationid);
	
	//  Update Designation for Designation Method
	public Designation updateDesignation(Designation designation);
	
	public List<Designation> getByHR();
	
	public List<Designation> getByOthers();

	//  Delete Designation by Designation Id Method
	public void deleteDesignationBydesignationid(Long designationid);
	
	

}
