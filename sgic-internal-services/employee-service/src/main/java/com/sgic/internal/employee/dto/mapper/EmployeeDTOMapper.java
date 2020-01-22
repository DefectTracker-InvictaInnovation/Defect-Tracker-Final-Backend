package com.sgic.internal.employee.dto.mapper;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.internal.employee.dto.EmployeeDTO;
import com.sgic.internal.employee.dto.converter.EmployeeConverter;
import com.sgic.internal.employee.entities.Employee;
import com.sgic.internal.employee.repositories.EmployeeRepository;
import com.sgic.internal.employee.services.EmployeeService;

@Service
public class EmployeeDTOMapper {

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private EmployeeConverter employeeConverter;

	private static Logger logger = LogManager.getLogger(EmployeeRepository.class);

	@SuppressWarnings("static-access")
	// Save Method for EmployeeMapper
	public Employee saveEmployee(EmployeeDTO employeeDTO) {
		logger.info("New Employee Successfully saved");
		return employeeService.saveEmployee(employeeConverter.EmployeeDTOToEmployee(employeeDTO));
	}

	@SuppressWarnings("static-access")
	// List Method for EmployeeMapper
	public List<EmployeeDTO> getAllSortEmployeeInfo(Long empId) {
		logger.info(" Employee Successfully Get All Employee Details ");
		List<Employee> sortEmployeeList = employeeService.findByEmployeeOrderByEmployeeIdDesc(empId);
		return employeeConverter.EmployeeToEmployeeDTOList(sortEmployeeList);

	}

	// GetByID Method for EmployeeMapper
	@SuppressWarnings("static-access")
	public EmployeeDTO getById(Long empId) {
		logger.info(" Employee Successfully Get By Id ");
		Employee employee = employeeService.getByempId(empId);
		return employeeConverter.EmployeeToEmployeeDTO(employee);

	}

	// Delete Method for EmployeeMapper
	public EmployeeDTO deleteByEmployeeId(Long empId) {
		logger.info(" successfully deleted ");
		employeeService.deleteEmployeeByempId(empId);
		return null;

	}

	// Find Employee By Email
	public EmployeeDTO getByEmployeeEmailforMapper(String email) {
		Employee employee = employeeService.getByEmail(email);
		return EmployeeConverter.EmployeeToEmployeeDTO(employee);

	}

	@SuppressWarnings({ "static-access", "unused" })
	// Update Employee
	public Employee UpdateEmployee(EmployeeDTO employeeDTO) {
		logger.info("Employee is Updated", employeeDTO.getEmpId());
		Employee employee = EmployeeConverter.EmployeeDTOToEmployee(employeeDTO);
		return employeeService.updateEmployee(employeeConverter.EmployeeDTOToEmployee(employeeDTO));

	}

	@SuppressWarnings({ "static-access", "unused" })
	// Update Employee
	public Employee UpdateBenchTrue(Long EmpId, EmployeeDTO employeeDTO) {
		logger.info("Employee is Updated", employeeDTO.getEmpId());
		Employee employee = EmployeeConverter.EmployeeDTOToEmployee(employeeDTO);
		employeeService.updateBenchTrue(EmpId, employeeConverter.EmployeeDTOToEmployee(employeeDTO));
		return employee;

	}

	@SuppressWarnings({ "static-access", "unused" })
	// Update Employee
	public Employee UpdateBenchFalse(Long EmpId, EmployeeDTO employeeDTO) {
		logger.info("Employee is Updated", employeeDTO.getEmpId());
		Employee employee = EmployeeConverter.EmployeeDTOToEmployee(employeeDTO);
		employeeService.updateBenchFalse(EmpId, employeeConverter.EmployeeDTOToEmployee(employeeDTO));
		return employee;

	}
//	@SuppressWarnings({ "static-access", "unused" })
//	// Update Employee
//	public Employee UpdateAvailaibility(Long EmpId, EmployeeDTO employeeDTO) {
//		logger.info("Employee is Updated Availaibity", employeeDTO.getEmpId());
//		Employee employee = EmployeeConverter.EmployeeDTOToEmployee(employeeDTO);
//		employeeService.updateAvailability(EmpId, employeeConverter.EmployeeDTOToEmployee(employeeDTO));
//		return employee;
//
//	}
	
	
	

	@SuppressWarnings("static-access")
	// Find Employee By Designation
	public List<EmployeeDTO> getEmployeeByDesignation(Long designationid) {
		logger.info("Successfully Get Employee By Designation");
		List<Employee> employee = employeeService.getByDesignation(designationid);
		return employeeConverter.EmployeeToEmployeeDTOList(employee);

	}

	@SuppressWarnings("static-access")
	// Find Employee By Name
	public List<EmployeeDTO> getEmployeeByName(String name) {
		logger.info("Successfully Get Employee By Name");
		List<Employee> employee = employeeService.getByName(name);
		return employeeConverter.EmployeeToEmployeeDTOList(employee);
	}

	// Count Method for Employee
	public long getByEmployeeCountforMapper() {
		return employeeService.count();
	}
	
	
	public List<EmployeeDTO> getAllPm() {
		logger.info(" Employee Successfully Get All Employee Details ");
		List<Employee> pmList = employeeService.getBydesignationname();
		return employeeConverter.EmployeeToEmployeeDTOList(pmList);

	}
	
	public List<EmployeeDTO> getAllOthers() {
		logger.info(" Employee Successfully Get All Employee Details ");
		List<Employee> othersList = employeeService.getByQaAndDevelopersOnly();
		return employeeConverter.EmployeeToEmployeeDTOList(othersList);

	}
	
	public List<EmployeeDTO> getHr() {
		logger.info(" Employee Successfully Get All Employee Details ");
		List<Employee> othersList = employeeService.getHR();
		return employeeConverter.EmployeeToEmployeeDTOList(othersList);

	}
	
	public List<EmployeeDTO> getByEmployees(String empId,String employeeid, String name, String firstname,
			String email,String designationname){
		List<Employee> list = employeeService.getByEmployee(empId,employeeid, name, firstname, email,designationname);
				return employeeConverter.EmployeeToEmployeeDTOList(list);
		
	}

}
