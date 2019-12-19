package com.sgic.internal.defecttracker.defectservice.util;

public class AppConstants {

	//Apis From Employee Service
	public static final String EMPLOYEE_GET_All_URL = "http://localhost:8084/employeeservice/getallemployee";
	public static final String EMPLOYEE_GET_BY_ID_URL="http://localhost:8084/employeeservice/getempolyeebyid/";
	public static final String UPDATE_AVAILABILITY_IN_EMPLOYEE_URL ="http://localhost:8084/employeeservice/update/availability/";
	public static final String UPDATE_BENCHTRUE_IN_EMPLOYEE_URL ="http://localhost:8084/employeeservice/update/benchtrue/";
	public static final String UPDATE_BENCHFALSE_IN_EMPLOYEE_URL ="http://localhost:8084/employeeservice/update/benchfalse/";
	
	//Apis From Defect Service
	public static final String ROLE_GET_All_URL = "http://localhost:8081/defectservices/getAllRole";
	
	//Apis From Login Service
	public static final String SIGNUP_URL = "http://localhost:8085/loginservice/api/auth/signup";
	
	
}
