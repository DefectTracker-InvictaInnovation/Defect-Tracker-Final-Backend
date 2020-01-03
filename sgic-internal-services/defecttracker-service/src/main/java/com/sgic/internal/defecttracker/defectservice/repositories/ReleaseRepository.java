package com.sgic.internal.defecttracker.defectservice.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sgic.internal.defecttracker.defectservice.entities.Release;

public interface ReleaseRepository extends JpaRepository<Release, Long> {
	
	Release getByReleaseId(Long releaseId);
	

	
	@Query(value = "from Release where project_id=:projectId")
	List<Release> getReleaseByProjectId(@Param("projectId") Long projectId);
	

}
