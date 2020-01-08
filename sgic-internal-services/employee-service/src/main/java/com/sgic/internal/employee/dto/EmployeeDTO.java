package com.sgic.internal.employee.dto;

public class EmployeeDTO {

//	Initialize EmployeeDTO
	private Long empId;
	private String employeeid;
	private String name;
	private String firstname;
	private String email;
	private Long designationid;
	private String designationname;
	private int availability =100;
	private boolean bench;
	private String profilePicPath;
	private String username;
	private String password;

	public EmployeeDTO() {
		super();
	}

	public EmployeeDTO(String string, String string2, String string3, String string4) {
		
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// Initialize Designation DTO Getter Setter
	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getDesignationid() {
		return designationid;
	}

	public void setDesignationid(Long designationid) {
		this.designationid = designationid;
	}

	public String getDesignationname() {
		return designationname;
	}

	public void setDesignationname(String designationname) {
		this.designationname = designationname;
	}

	public int getAvailability() {
		return availability;
	}

	public void setAvailability(int availability) {
		this.availability = availability;
	}

	public boolean isBench() {
		return bench;
	}

	public void setBench(boolean bench) {
		this.bench = bench;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getProfilePicPath() {
		return profilePicPath;
	}

	public void setProfilePicPath(String profilePicPath) {
		this.profilePicPath = profilePicPath;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


}