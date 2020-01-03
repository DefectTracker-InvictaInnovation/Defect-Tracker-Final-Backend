package com.sgic.internal.defecttracker.defectservice.repositories;
import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sgic.internal.defecttracker.defectservice.entities.Defect;
import com.sgic.internal.defecttracker.defectservice.entities.Module;


public interface DefectRepository extends JpaRepository<Defect, Long >{

Defect getByDefectId(Long defectId);

@Query(value ="FROM Defect WHERE defect_abbr =:defectAbbr") 
List<Defect> getByDefectAbbr(String defectAbbr);

@Query(value ="FROM Defect WHERE project_id =:projectId") 
List<Defect>getByProjectId(@Param("projectId")Long projectId); 

@Query(value ="FROM Defect WHERE module_id =:moduleId") 
List<Defect>getByModuleId(@Param("moduleId")Long moduleId);


@Query(value ="FROM Defect WHERE date_and_time =:dateAndTime") 
List<Defect>getByDefectDate(@Param("dateAndTime")Date dateAndTime);


@Query(value ="FROM Defect WHERE available_in =:availableIn") 
List<Defect>getByAvailableIn(@Param("availableIn")String availableIn);

//@Modifying
//@Query("UPDATE Defect d SET d.statusId = :status_id WHERE d.defect_id = :defectId")
//int updateStatusId(@Param("defectId") Long defectId, @Param("statusId") int statusId);

@Query(value ="FROM Defect WHERE found_in =:foundIn") 
List<Defect>getByFoundIn(@Param("foundIn")String foundIn);

@Query(value ="FROM Defect WHERE fixed_in =:fixedIn") 
List<Defect>getByFixedIn(@Param("fixedIn")String fixedIn);


List<Defect> findDefectByModule(Module module);

@Query(value ="SELECT d FROM Defect d WHERE status =:status")
List<Defect> getByStatus(@Param("status")String status);

@Query(value ="SELECT d FROM Defect d WHERE priority =:priority")
List<Defect> getByPriority(@Param("priority")String priority);

@Query(value ="SELECT d FROM Defect d WHERE severity =:severity")
List<Defect> getBySeverity(@Param("severity")String severity);

@Query(value ="SELECT d FROM Defect d WHERE type =:type")
List<Defect> getByType(@Param("type")String type);


@Query(value = "SELECT COUNT(status) FROM Defect WHERE project_id=:projectId AND status =:status")
Long countByStatus(String status, Long projectId );

@Query("SELECT COUNT(severity) FROM Defect WHERE severity='Low'")
int countBySeverity();

@Query("SELECT COUNT(severity) FROM Defect WHERE severity='Medium'")
int countBySeverityMedium();

@Query("SELECT COUNT(severity) FROM Defect WHERE severity='High'")
int countBySeverityhigh();

@Query("SELECT COUNT(status) FROM Defect WHERE status='Rejected' ")
int countByStatusRejected();

public long count();

@Query("SELECT COUNT(severity) FROM Defect WHERE status='Rejected' AND severity = 'low'")
int countByStatusRejectedlow();

@Query("SELECT COUNT(severity) FROM Defect WHERE status='Rejected' AND severity = 'High'")
int countByStatusRejectedHigh();

@Query("SELECT COUNT(severity) FROM Defect WHERE status='Rejected' AND severity = 'medium'")
int countByStatusRejectedmedium();

@Query("SELECT COUNT(priority) FROM Defect WHERE priority='Medium'")
int countByPriorityMedium();

@Query("SELECT COUNT(priority) FROM Defect WHERE status='Rejected' AND priority = 'medium'")
int countByPriorityStatusRejectedmedium();

@Query("SELECT COUNT(priority) FROM Defect WHERE priority='High'")
int countByPriorityHigh();

@Query("SELECT COUNT(priority) FROM Defect WHERE status='Rejected' AND priority = 'High'")
int countByPriorityStatusRejectedhigh();

@Query("SELECT COUNT(priority) FROM Defect WHERE priority='low'")
int countByPriorityLow();

@Query("SELECT COUNT(priority) FROM Defect WHERE status='Rejected' AND priority = 'low'")
int countByPriorityStatusRejectedlow();



//start code for severity Index

String fetchhighseverityweight = "SELECT high_weight FROM severityweight";
@Query(value = fetchhighseverityweight, nativeQuery = true)
long getHighWeight();

String fetchmediumseverityweight = "SELECT medium_weight FROM severityweight";
@Query(value = fetchmediumseverityweight, nativeQuery = true)
long getMediumWeight();

String fetchlowseverityweight = "SELECT low_weight FROM severityweight";
@Query(value = fetchlowseverityweight, nativeQuery = true)
long getLowWeight();

String countByRejectedStatusAndSeverityHigh ="SELECT COUNT(defect_id) FROM defect WHERE project_id=:projectId AND severity=\"High\" AND status!=\"Rejected\"";
@Query(value = countByRejectedStatusAndSeverityHigh, nativeQuery = true)
Long siCountDefectByRejectedStatusAndSeverityHigh(Long projectId );

String countByRejectedStatusAndSeverityLow ="SELECT COUNT(defect_id) FROM defect WHERE project_id=:projectId AND severity=\"Low\" AND status!=\"Rejected\"";
@Query(value = countByRejectedStatusAndSeverityLow, nativeQuery = true)
Long siCountDefectByRejectedStatusAndSeverityLow(Long projectId );

String countByRejectedStatusAndSeverityMedium ="SELECT COUNT(defect_id) FROM defect WHERE project_id=:projectId AND severity=\"Medium\" AND status!=\"Rejected\"";
@Query(value = countByRejectedStatusAndSeverityMedium, nativeQuery = true)
Long siCountDefectByRejectedStatusAndSeverityMedium(Long projectId );

String countTotalDefectWithoutRejected ="SELECT COUNT(defect_id) FROM defect WHERE project_id=:projectId AND status!=\"Rejected\"";
@Query(value = countTotalDefectWithoutRejected, nativeQuery = true)
Long siCountDefectByProject(Long projectId );

//end code for severity Index
}


