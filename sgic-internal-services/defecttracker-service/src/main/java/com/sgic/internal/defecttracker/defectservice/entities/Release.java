package com.sgic.internal.defecttracker.defectservice.entities;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity

@Table(schema="defectservices",name = "release", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
            "projectId"
        })
        
})
public class Release {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long releaseId;
	
	
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	private ArrayList<String> releaseName;
	
	@ManyToOne
	@JoinColumn(name="projectId",nullable=false)
	private Project project;

	
	public Long getReleaseId() {
		return releaseId;
	}

	public void setReleaseId(Long releaseId) {
		this.releaseId = releaseId;
	}
	
	public ArrayList<String> getReleaseName() {
		return releaseName;
	}

	public void setReleaseName(ArrayList<String> releaseName) {
		this.releaseName = releaseName;
	}



	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	

	
}
