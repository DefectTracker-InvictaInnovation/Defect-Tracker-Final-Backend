package com.sgic.internal.defecttracker.defectservice.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.sgic.internal.defecttracker.defectservice.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

	String fetchPm = "select * from role where role_name=\"PM\"";
	@Query(value = fetchPm, nativeQuery = true)
	List<Role> findPmRoleOnly();
}
