package com.sgic.internal.defecttracker.defectservice.controller.dto.converter;


import com.sgic.internal.defecttracker.defectservice.controller.dto.ModuleAssignDto;
import com.sgic.internal.defecttracker.defectservice.entities.Module;
import com.sgic.internal.defecttracker.defectservice.entities.ModuleAssign;
import com.sgic.internal.defecttracker.defectservice.entities.Project;
import com.sgic.internal.defecttracker.defectservice.entities.ProjectRoleAllocation;

public class ModuleAssignConverter {
	private ModuleAssignConverter() {
	}

	public static ModuleAssign moduleAssignDtoToModuleAssign(ModuleAssignDto moduleAssignDto) {
		ModuleAssign moduleAssign = new ModuleAssign();

		if (moduleAssignDto != null) {

			Project project = new Project();
//			moduleAssign.setProjectId(moduleAssignDto.getProjectId());
//			moduleAssign.setSubmoduleId(moduleAssignDto.getSubmoduleId());
			
			project.setProjectId(moduleAssignDto.getProjectId());
			moduleAssign.setProject(project);
			
			moduleAssign.setSubmoduleId(moduleAssignDto.getSubmoduleId());

			Module module = new Module();
			module.setModuleId(moduleAssignDto.getModuleId());
			moduleAssign.setModule(module);
			
			ProjectRoleAllocation projectRoleAllocation = new ProjectRoleAllocation();
			projectRoleAllocation.setProjectroleId(moduleAssignDto.getProjectroleId());
			moduleAssign.setProjectRoleAllocation(projectRoleAllocation);
			

			return moduleAssign;
		}
		return null;
	}
	
	public static ModuleAssignDto ModuleAssignToModuleAssignDTO(ModuleAssign moduleAssign) {
		ModuleAssignDto moduleAssignDto = new ModuleAssignDto();
		if (moduleAssign != null) {
			
			moduleAssignDto.setId(moduleAssign.getId());
			moduleAssignDto.setModuleId(moduleAssign.getModule().getModuleId());
			moduleAssignDto.setModuleName(moduleAssign.getModule().getModuleName());
			moduleAssignDto.setProjectroleId(moduleAssign.getProjectRoleAllocation().getProjectroleId());
			moduleAssignDto.setSubmoduleId(moduleAssign.getSubmoduleId());
			moduleAssignDto.setProjectId(moduleAssign.getProject().getProjectId());
			return moduleAssignDto;
		}
		return null;
	}

}
