package com.sgic.internal.defecttracker.defectservice.controller.dto;

public class ProjectRoleAllocationDto {

	private Long projectroleId;
	private Long resourceId;
	private Long roleId;
	private String password;
	private String name;
	private String firstname;
	private String email;
	private String roleName;
	private String employeeid;
	private Long projectId;
	private String projectName;
	private Long moduleId;
	private String moduleName;
	private Long subModuleId;
	private String subModuleName;
	private boolean bench;
	

	public boolean isBench() {
		return bench;
	}
	public boolean setBench(boolean bench) {
		return this.bench = bench;
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
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Long getProjectroleId() {
		return projectroleId;
	}
	public void setProjectroleId(Long projectroleId) {
		this.projectroleId = projectroleId;
	}
	public Long getResourceId() {
		return resourceId;
	}
	public void setResourceId(Long resourceId) {
		this.resourceId = resourceId;
	}
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	
	
	public Long getProjectId() {
		return projectId;
	}
	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String string) {
		this.password = string;
	}
	
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	
	public Long getModuleId() {
		return moduleId;
	}
	public void setModuleId(Long moduleId) {
		this.moduleId = moduleId;
	}
	public Long getSubModuleId() {
		return subModuleId;
	}
	public void setSubModuleId(Long subModuleId) {
		this.subModuleId = subModuleId;
	}
	public String getSubModuleName() {
		return subModuleName;
	}
	public void setSubModuleName(String subModuleName) {
		this.subModuleName = subModuleName;
	}

	
}
