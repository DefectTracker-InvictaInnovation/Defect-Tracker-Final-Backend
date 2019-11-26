package com.sgic.internal.employee.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import com.sgic.internal.employee.util.AppConstants;

@ConfigurationProperties(prefix = AppConstants.FILE_PROPERTIES_PREFIX)
public class FileStorageProperties {

	private String uploadDir;

	public String getUploadDir() {
		return uploadDir;
	}

	public void setUploadDir(String uploadDir) {
		this.uploadDir = uploadDir;
	}
}
