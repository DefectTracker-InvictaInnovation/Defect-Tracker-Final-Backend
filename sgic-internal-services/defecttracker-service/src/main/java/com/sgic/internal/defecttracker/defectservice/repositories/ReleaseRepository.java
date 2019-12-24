package com.sgic.internal.defecttracker.defectservice.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sgic.internal.defecttracker.defectservice.entities.Release;

public interface ReleaseRepository extends JpaRepository<Release, Long> {
	
	Release getByReleaseId(Long releaseId);
	
//	String FINDRELEASE= "SELECT * FROM release where project_id=:projectId";
//	@Query(value=FINDRELEASE ,nativeQuery=true)
//	Release getrelease(Long projectId);
	
////	String FINDRELEASE= "SELECT * FROM release where project_id=?1";
//	@Query(value="SELECT * FROM Release where project_id =: projectId")
//	Release getrelease(@Param("projectId")Long projectId);
	
	@Query(value = "from Release where project_id=:projectId")
	List<Release> getReleaseByProjectId(@Param("projectId") Long projectId);
	

}
