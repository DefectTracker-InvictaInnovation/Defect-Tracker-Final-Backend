package com.sgic.internal.employee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.sgic.internal.employee.util.AppConstants;

@Controller
public class ViewController {

	@RequestMapping(value = AppConstants.INDEX_PAGE_URI, method = RequestMethod.GET)
	public String indexPage() {
		return AppConstants.INDEX_PAGE;
	}
}
