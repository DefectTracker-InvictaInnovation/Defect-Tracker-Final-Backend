package com.sgic.internal.defecttracker.defectservice.controller.dto.converter;

import java.util.ArrayList;
import java.util.List;

import com.sgic.internal.defecttracker.defectservice.controller.dto.ModuleData;
import com.sgic.internal.defecttracker.defectservice.entities.Module;
import com.sgic.internal.defecttracker.defectservice.entities.Project;


public class ModuleConverter {
	public static ModuleData moduleToModuleData(Module module) {
		ModuleData moduleData = new ModuleData();

		if (module != null) {
			moduleData.setModuleId(module.getModuleId());
			moduleData.setModuleName(module.getModuleName());
            moduleData.setProjectId(module.getProject().getProjectId());
            moduleData.setProjectName(module.getProject().getProjectName());
            moduleData.setSubModule(module.getSubModule());
			return moduleData;
		}
		return null;
	}
	
	public static Module moduleDataToModule(ModuleData moduleData) {
		Module module = new Module();  
		module.setModuleId(moduleData.getModuleId());
		module.setModuleName(moduleData.getModuleName());
		
		// project constructor
		Project project = new Project();
		project.setProjectId(moduleData.getProjectId());
		project.setProjectName(moduleData.getProjectName());
		module.setProject(project);
		
		return module;
	}
	
	public static List<ModuleData> moduleToModuleDataList(List<Module> moduleList) {

		if (moduleList != null) {
			List<ModuleData> lModuleData = new ArrayList<>();
			for (Module module : moduleList) {
				ModuleData moduleData = new ModuleData();
				
				moduleData.setModuleId(module.getModuleId());
				moduleData.setModuleName(module.getModuleName());
				
				moduleData.setProjectId(module.getProject().getProjectId());
				moduleData.setProjectName(module.getProject().getProjectName());
				
				moduleData.setSubModule(module.getSubModule());
				
				lModuleData.add(moduleData);
			}

			return lModuleData;
		}
		return null;

	}
}
