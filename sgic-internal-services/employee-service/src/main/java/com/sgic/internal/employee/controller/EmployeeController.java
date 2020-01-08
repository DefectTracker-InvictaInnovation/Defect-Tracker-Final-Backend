package com.sgic.internal.employee.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sgic.internal.employee.dto.EmployeeDTO;
import com.sgic.internal.employee.dto.UserDto;
import com.sgic.internal.employee.dto.mapper.EmployeeDTOMapper;
import com.sgic.internal.employee.entities.AppResponse;
import com.sgic.internal.employee.entities.Designation;
import com.sgic.internal.employee.repositories.EmployeeRepository;
import com.sgic.internal.employee.services.EmployeeService;
import com.sgic.internal.employee.services.FileStorageService;
import com.sgic.internal.employee.util.AppConstants;



@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EmployeeController {

	@Autowired
	private EmployeeDTOMapper employeeDTOMapper;

	@Autowired
	private EmployeeService employeeservice;
	ObjectMapper objectMapper = new ObjectMapper();

	@Autowired
	private EmployeeRepository employeeRepository;
	

	@Autowired
	FileStorageService fileStorageService;

	@Autowired
	private RestTemplate restTemplate;

	private static Logger logger = LogManager.getLogger(EmployeeDTOMapper.class);

//	/* Author:KeerthanaR 17-06-2019 */
//	// Create Employee
//	@PostMapping(value = "/createemployee")
//	public Employee createEmployee(@RequestBody EmployeeDTO employeeDTO) {
//		logger.info("Employee Controller -> CreateEmployee");
//
//		try {
//			
//			SimpleMailMessage mail = new SimpleMailMessage();
//			Designation designation = new Designation();
//			designation.setDesignationname(employeeDTO.getDesignationname());
//			
//			mail.setTo(employeeDTO.getEmail());
//			mail.setSubject("Hello " + employeeDTO.getFirstname() + " this your password :" + employeeDTO.getName());
//			mail.setText("This is a cool email notification");
//
//			System.out.println("Employee Email Address:" + employeeDTO.getEmail());
//			notificationService.sendNotofication(mail);
//			if (employeeDTOMapper.getById(employeeDTO.getEmpId()) != null) {
//				logger.info("Successfully Saved");
//				System.out.println("Successfully Saved");
//			} else {
//				employeeDTOMapper.saveEmployee(employeeDTO);
//			}
//
//		} catch (Exception ex) {
//			logger.error("Check Your Error");
//			System.out.println("Something went Wrong" + ex.getMessage());
//		}
//
//		return null;
//	}

	/* Author:KiishanthS 17-06-2019 */
	// List Employee
	@GetMapping(value = "/getallemployee")
	public ResponseEntity<List<EmployeeDTO>> sortListEmployeeInfo(Long empId) {
		try {
			logger.info("Employee Controller : --> GetAllEmployeeInfo");
			return new ResponseEntity<>(employeeDTOMapper.getAllSortEmployeeInfo(empId), HttpStatus.OK);
		} catch (Exception ex) {
			logger.error("Employee Controller Error :-> " + ex.getMessage());
		}

		return null;
	}

	/* Author:DalistaaA 17-06-2019 */
	// Get Employee By Employee ID
	@GetMapping("/getempolyeebyid/{empId}")
	public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable(name = "empId") Long empId) {
		try {
			logger.info("Employee Controller :-> GetEmployeeById");
			return new ResponseEntity<>(employeeDTOMapper.getById(empId), HttpStatus.OK);

		} catch (Exception ex) {
			logger.error("Employee Controller :->" + ex.getMessage());

		}
		return null;

	}

	/* Author:JothiM 17-06-2019 */
	// Delete Employee Using Employee ID
	@DeleteMapping("/deletebyid/{empId}")
	public ResponseEntity<String> deleteEmployeeByempId(@PathVariable("empId") Long empId) {
		try {
			logger.info("Employee Controller :-> DeleteEmployeeById");
			employeeDTOMapper.deleteByEmployeeId(empId);
			return new ResponseEntity<>("Deleted Successfully", HttpStatus.OK);
		} catch (Exception ex) {
			logger.error("Employee Controller :-> Error" + ex.getMessage());
		}
		return null;
	}

	/* Author:ThuvarakanT 17-06-2019 */
	// Get Employee By Email
	@GetMapping("/getemail/{email}")
	public ResponseEntity<EmployeeDTO> getEmployeeByEmail(@PathVariable(name = "email") String email) {
		try {
			logger.info("Employee Controller:: -> GetEmail");
			return new ResponseEntity<>(employeeDTOMapper.getByEmployeeEmailforMapper(email), HttpStatus.OK);
		} catch (Exception ex) {
			logger.error("Employee Controller:: -> Error" + ex.getMessage());
		}
		return null;
	}

	/* Author:RammiyaN 19-06-2019 */
	// update Employee Using Employee ID
	@PutMapping("update/{empId}")
	public ResponseEntity<String> updateEmployee(@RequestBody EmployeeDTO employeeDTO) {
		try {
			logger.info("Employee Controller :-> Update");
			if (employeeDTOMapper.UpdateEmployee(employeeDTO) != null) {
				return new ResponseEntity<>("Successfully Updated", HttpStatus.OK);
			}
			return new ResponseEntity<>("Failed To Update", HttpStatus.OK);
		} catch (Exception ex) {
			logger.error("Employee Controller :-> Error" + ex.getMessage());
		}

		return null;
	}

	/* Author:DalistaaA 19-06-2019 */
	// Get Employee By Designation
	@GetMapping("/getdesignation/{designationid}")
	public List<EmployeeDTO> getByDesignation(@PathVariable(name = "designationid") Long designationid) {
		try {
			logger.info("Employee Controller :-> GetDesignation");
			return employeeDTOMapper.getEmployeeByDesignation(designationid);
		} catch (Exception ex) {
			logger.error("Employee Controller :-> Error" + ex.getMessage());
		}
		return null;

	}

	/* Author:KeerthanaR 23-06-2019 */
	// Get Employee By Name
	@GetMapping("/getname/{name}")
	public List<EmployeeDTO> getByName(@PathVariable(name = "name") String name) {
		try {
			logger.info("Employee Controller -> GetName");
			return employeeDTOMapper.getEmployeeByName(name);
		} catch (Exception ex) {
			logger.error("Employee Controller -> error" + ex.getMessage());
		}
		return null;

	}

	@GetMapping("/getcount")
// <----	Employee DataBase Employee Table Row Count Method --->
	public ResponseEntity<Long> getTotalCount() {
		try {
			logger.info("Employee Controller :-> getCount");
			return new ResponseEntity<>(employeeDTOMapper.getByEmployeeCountforMapper(), HttpStatus.OK);
		} catch (Exception ex) {
			logger.error("Employee Controller :-> Error" + ex.getMessage());
		}
		return null;

	}

	@PostMapping("/database")
//	<----Import Excel File For Employee Service Employee Table---> 
	public String uploadMultipartFile(@RequestParam("uploadfile") MultipartFile file, Model model) {
		try {
			System.out.println("controller");
			employeeservice.store(file);
			model.addAttribute("message", "File uploaded successfully!");
		} catch (Exception e) {
			model.addAttribute("message", "Fail! -> uploaded filename: " + file.getOriginalFilename());
		}
		return "File uploaded successfully";
	}

	@GetMapping("/getdevelopercount")
	// <---- Employee DataBase Employee Table Row Count Method --->
	public long getTotalDeveloperCount() {
		try {
			logger.info("Employee Controller :-> getCount");
			long name = employeeRepository.countByDesignationName("Developer");
			return employeeservice.countDeveloper(name);
		} catch (Exception ex) {
			logger.error("Employee Controller :-> Error" + ex.getMessage());
		}
		return (Long) null;

	}

	@GetMapping("/getTotalQaCount")
	public long getTotalQaCount() {
		try {
			Long name = employeeRepository.countByDesignationName("QA");
			return employeeservice.countDeveloper(name);
		} catch (Exception e) {
		}
		return (Long) null;

	}

	@GetMapping("/getTotalPmCount")
	public long getTotalPmCount() {
		try {
			Long name = employeeRepository.countByDesignationName("PM");
			return employeeservice.countDeveloper(name);
		} catch (Exception e) {
		}
		return (Long) null;

	}

	@GetMapping("/getTotalHRCount")
	public long getTotalHRCount() {
		try {
			Long name = employeeRepository.countByDesignationName("HR");
			return employeeservice.countDeveloper(name);
		} catch (Exception e) {
		}
		return (Long) null;

	}

	@GetMapping("/getTotalTecLeadCount")
	public long getTotalTecLeadCount() {
		try {
			Long name = employeeRepository.countByDesignationName("TecLead");
			return employeeservice.countDeveloper(name);
		} catch (Exception e) {
		}
		return (Long) null;

	}

	@GetMapping("/getTotalQALeadCount")
	public long getTotalQALeadCount() {
		try {
			Long name = employeeRepository.countByDesignationName("QALead");
			return employeeservice.countDeveloper(name);
		} catch (Exception e) {
		}
		return (Long) null;

	}

	@RequestMapping(value = "/saveemployee", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public AppResponse createemployee(
			@RequestParam(value = AppConstants.EMPLOYEE_JSON_PARAM, required = true) String extra,
			@RequestParam(required = false, value = AppConstants.EMPLOYEE_FILE_PARAM) MultipartFile file)
			throws JsonParseException, JsonMappingException, IOException {


		if (!file.isEmpty()) {
			System.out.println("yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");
			EmployeeDTO employeeDTO = objectMapper.readValue(extra, EmployeeDTO.class);
			String fileName = fileStorageService.storeFile(file);
			String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
					.path(AppConstants.DOWNLOAD_PATH).path(fileName).toUriString();
			employeeDTO.setProfilePicPath(fileDownloadUri);
			
			if(employeeDTO.getDesignationname().equalsIgnoreCase("HR")) {
				employeeDTOMapper.saveEmployee(employeeDTO);
					UserDto user = new UserDto();
					user.setName(employeeDTO.getFirstname());
					user.setUsername(employeeDTO.getUsername());
					user.setEmail(employeeDTO.getEmail());
					user.setPassword(employeeDTO.getPassword());
					user.setRole(employeeDTO.getDesignationname());
					user.setLastname(employeeDTO.getName());

					System.out.println("userList " + user);

					System.out.println("passowrdbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb" + user.getPassword());

					HttpHeaders headers = new HttpHeaders();
					headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
					HttpEntity<UserDto> entity = new HttpEntity<UserDto>(user, headers);
					System.out.println("yes");
					ResponseEntity<?> obj = restTemplate.exchange(AppConstants.SIGNUP_URL, HttpMethod.POST, entity,
							UserDto.class);

					System.out.println("obj" + obj);

				
			}else {
				employeeDTOMapper.saveEmployee(employeeDTO);

			}
			}
		 else {
			EmployeeDTO employeeDTO = objectMapper.readValue(extra, EmployeeDTO.class);
			System.out.println("llllllllllllllllllllllllllllllllllllllllllllll");
//			String fileName = fileStorageService.storeFile(file);
//			String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath().path(AppConstants.DOWNLOAD_PATH)
//					.path(fileName).toUriString();
			employeeDTO.setProfilePicPath(
					"http://localhost:8084/employeeservice/downloadFile/1570768396385_Full-HD-1080p-Wallpaper-HD-Nature.jpg");
			employeeDTOMapper.saveEmployee(employeeDTO);
		}

//		Employee employee = objectMapper.readValue(empJson, Employee.class);
//		employee.setProfilePicPath(fileDownloadUri);
//		employeeservice.saveEmployee(employee);

		return new AppResponse(AppConstants.SUCCESS_CODE, AppConstants.SUCCESS_MSG);

	}

	@RequestMapping(value = AppConstants.DOWNLOAD_URI, method = RequestMethod.GET)
	public ResponseEntity<Resource> downloadFile(@PathVariable String fileName, HttpServletRequest request) {
		Resource resource = fileStorageService.loadFileAsResource(fileName);
		String contentType = null;
		try {
			contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		if (contentType == null) {
			contentType = AppConstants.DEFAULT_CONTENT_TYPE;
		}
		return ResponseEntity.ok().contentType(MediaType.parseMediaType(contentType))
				.header(HttpHeaders.CONTENT_DISPOSITION,
						String.format(AppConstants.FILE_DOWNLOAD_HTTP_HEADER, resource.getFilename()))
				.body(resource);
	}

// <--------     update bench when allocate resource     ---->
	@RequestMapping(value = "update/benchtrue/{empId}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> updateBenchTrue(@RequestBody EmployeeDTO employeeDTO,
			@PathVariable("empId") Long empId) {
		try {
			logger.info("Employee Controller :-> Update");
			// employeeDTOMapper.UpdateBenchTrue(empId,employeeDTO);
			if (employeeDTOMapper.UpdateBenchTrue(empId, employeeDTO) != null) {
				return new ResponseEntity<>("Successfully Updated", HttpStatus.OK);
			}
			return new ResponseEntity<>("Failed To Update", HttpStatus.OK);
		} catch (Exception ex) {
			logger.error("Employee Controller :-> Error" + ex.getMessage());
		}

		return null;
	}

// <-------       update bench when deallocate resource      ------>
	@RequestMapping(value = "update/benchfalse/{empId}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> updateBenchFalse(@RequestBody EmployeeDTO employeeDTO,
			@PathVariable("empId") Long empId) {
		try {
			logger.info("Employee Controller :-> Update");
//		employeeDTOMapper.UpdateBenchFalse(empId,employeeDTO);
			if (employeeDTOMapper.UpdateBenchFalse(empId, employeeDTO) != null) {
				return new ResponseEntity<>("Successfully Updated", HttpStatus.OK);
			}
			return new ResponseEntity<>("Failed To Update", HttpStatus.OK);
		} catch (Exception ex) {
			logger.error("Employee Controller :-> Error" + ex.getMessage());
		}

		return null;
	}

// <-------       update availability when allocate the resource      ------>
	@RequestMapping(value = "update/availability/{empId}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> updateAvailability(@RequestBody EmployeeDTO employeeDTO,
			@PathVariable("empId") Long empId) {

		try {
			logger.info("Employee Controller :-> Update Availability");
			int availablenow = employeeDTO.getAvailability();
			System.out.println("availablenow" + availablenow);
			employeeRepository.updateAvailability(availablenow, empId);

//			if (employeeDTOMapper.UpdateAvailaibility(empId, employeeDTO) != null) {
//				return new ResponseEntity<>("Successfully Updated Availability", HttpStatus.OK);
//			}
//			return new ResponseEntity<>("Failed To Update", HttpStatus.OK);
		} catch (Exception ex) {
			logger.error("Employee Controller :-> Error" + ex.getMessage());
		}

		return null;
	}

	@GetMapping("/getpm")
	// <---Get Designation By Designation ID--->
	public ResponseEntity<List<EmployeeDTO>> getByName() {
		logger.info("Designation Controller --> Get by Designation by Id");
		return new ResponseEntity<>(employeeDTOMapper.getAllPm(), HttpStatus.OK);
	}

	@GetMapping("/getothers")
	// <---Get Designation By Designation ID--->
	public ResponseEntity<List<EmployeeDTO>> getOtherAllEmployees() {
		logger.info("Designation Controller --> Get by Designation by Id");
		return new ResponseEntity<>(employeeDTOMapper.getAllOthers(), HttpStatus.OK);
	}

	@GetMapping("/gethr")
	// <---Get Designation By Designation ID--->
	public ResponseEntity<List<EmployeeDTO>> getHROnly() {
		logger.info("Designation Controller --> Get by Designation by Id");
		return new ResponseEntity<>(employeeDTOMapper.getHr(), HttpStatus.OK);
	}
	

}
