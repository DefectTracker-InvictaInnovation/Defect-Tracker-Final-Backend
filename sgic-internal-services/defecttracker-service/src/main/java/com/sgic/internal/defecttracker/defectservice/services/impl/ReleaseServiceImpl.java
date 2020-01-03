package com.sgic.internal.defecttracker.defectservice.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.internal.defecttracker.defectservice.entities.Release;
import com.sgic.internal.defecttracker.defectservice.repositories.ReleaseRepository;
import com.sgic.internal.defecttracker.defectservice.services.ReleaseService;

@Service
public class ReleaseServiceImpl implements ReleaseService {
	
	@Autowired
	private ReleaseRepository releaseRepository;

	@Override
	public Release createRelease(Release release) {
		return releaseRepository.save(release);
	}

	@Override
	public List<Release> getAllRelease() {
		return releaseRepository.findAll();
	}

	@Override
	public Release updateRelease(Release release) {
		Long releaseId=release.getReleaseId();
		boolean isExist=releaseRepository.getByReleaseId(releaseId) != null;
		if(isExist) {
			return releaseRepository.save(release);
		}else {
		}
		
		
		return null;
	}

	@Override
	public List<Release> getReleaseByProjectId(Long projectId) {
		
		return releaseRepository.getReleaseByProjectId(projectId);
	}
	
}
