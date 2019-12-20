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

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(schema="defectservices",name = "release")
public class Release {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long releaseId;
	
	//private List<String> releaseName;
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	private ArrayList<String> releaseName;
	
	public ArrayList<String> getReleaseName() {
		return releaseName;
	}

	public void setReleaseName(ArrayList<String> releaseName) {
		this.releaseName = releaseName;
	}

	@ManyToOne
	@JoinColumn(name="projectId",nullable=false)
	private Project project;

	public Long getReleaseId() {
		return releaseId;
	}

	public void setReleaseId(Long releaseId) {
		this.releaseId = releaseId;
	}

//	public List<String> getReleaseName() {
//		return releaseName;
//	}
//
//	public void setReleaseName(List<String> releaseName) {
//		this.releaseName = releaseName;
//	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	

	
}
