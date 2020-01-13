package com.sgic.internal.defecttracker.defectservice.services.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.internal.defecttracker.defectservice.entities.ModuleAssign;
import com.sgic.internal.defecttracker.defectservice.entities.SubModule;
import com.sgic.internal.defecttracker.defectservice.repositories.ModuleAssignRepository;
import com.sgic.internal.defecttracker.defectservice.repositories.SubModuleRepository;
import com.sgic.internal.defecttracker.defectservice.services.SubModuleService;

@Service
public class SubModuleServiceImpl implements SubModuleService {

	@Autowired
	private SubModuleRepository subModuleRepository;

	@Autowired
	ModuleAssignRepository moduleAssignRepository;

	@Override
	public SubModule createSubModule(SubModule subModule) {
		SubModule responseSubModule = subModuleRepository.save(subModule);
		return responseSubModule;
	}

	@Override
	public boolean isSubModuleAlreadyExists(Long subModuleId) {
		return subModuleRepository.existsById(subModuleId);
	}

	@Override
	public List<SubModule> getallDetails() {
		return subModuleRepository.findAll();
	}

	@Override
	public void deleteSubModuleById(Long subModuleId) {
		subModuleRepository.deleteById(subModuleId);

	}

	@Override
	public SubModule updateSubModule(Long subModuleId, SubModule subModule) {
		if (subModuleRepository.getOne(subModuleId) != null) {
			subModule.setSubModuleId(subModuleId);
			subModuleRepository.save(subModule);
		}
		return subModule;
	}

	@Override
	public SubModule getBySubModuleId(Long subModuleId) {
		return subModuleRepository.getBySubModuleId(subModuleId);
	}

	@Override
	public List<SubModule> getBysubModuleName(String subModuleName) {
		return subModuleRepository.getBysubModuleName(subModuleName);
	}

	@Override
	public List<SubModule> getByabbre(String abbre) {
		return null;
	}

	@Override
	public List<SubModule> getByModuleId(Long moduleId) {
		// TODO Auto-generated method stub
		List<SubModule> module = subModuleRepository.getByModuleName(moduleId);
		System.out.println("moduleid" + module);
		ArrayList<Long> ar = new ArrayList<Long>();
		ArrayList<Long> br = new ArrayList<Long>();

		List<ModuleAssign> s2 = moduleAssignRepository.findAll();

		for (ModuleAssign entry : s2) {
			entry.getSubmoduleId();
			System.out.println("Allocated submodule" + entry.getSubmoduleId());
			for (int i = 0; i < entry.getSubmoduleId().size(); i++) {
				Long s3 = entry.getSubmoduleId().get(i);
				br.add(entry.getSubmoduleId().get(i));

//			}

			}
		}

		for (SubModule entryy : module) {
			SubModule obj = new SubModule();
			obj.setSubModuleId(entryy.getSubModuleId());
			obj.setSubModuleName(entryy.getSubModuleName());

			Long s1 = obj.getSubModuleId();
			ar.add(s1);
		}

		System.out.println("All submodules " + Arrays.toString(ar.toArray()));
//		List<Long> ar2 = new ArrayList<Long>();
//		ar2.add(s2.get(0));
		ar.removeAll(br);
				
		System.out.println("Remaining Submodule" + ar);

		return module;

	}
}
