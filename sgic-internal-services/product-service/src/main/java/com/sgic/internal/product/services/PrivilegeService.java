package com.sgic.internal.product.services;

import java.util.List;

import com.sgic.internal.product.entities.Privilege;

public interface PrivilegeService {

	//Get Privilege By Id
	public Privilege getPrivilegeById(String privilageId);

	// Save Privilege
	public Privilege savePrivilege(Privilege privilege);

	// List all Privilege
	public List<Privilege> getAllPrivilege();

	// Delete Privilege
	public void deletePrivilegeById(String privilageId);

	// Update Privilege
	public Privilege updatePrivilege(Privilege privilege);
}
