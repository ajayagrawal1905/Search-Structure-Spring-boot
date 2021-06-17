package com.search.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.search.app.constants.EtmsConstants;
import com.search.app.service.SearchService;
import com.search.app.base.controller.BaseController;
import com.search.app.bo.BaseResponseBO;
import com.search.app.message.*;

@RestController
public class SearchController extends BaseController {

	@Autowired
	SearchService searchService;
	
	@PostMapping(value = EtmsConstants.IMappingConstants.SEARCH)
	public ResponseEntity<BaseResponseBO> searchQuery() {
		try {
			searchService.searchQuery();
			return getResponseModel(null, IResponseCode.SUCCESS, IResponseMessage.DATA_STORED_SUCCESSFULLY, null);
		} catch (Exception e) {
			e.printStackTrace();
			return getResponseModel(null, IResponseCode.SERVER_ERROR, IResponseMessage.SERVER_ERROR, null);
		}
	}

}
