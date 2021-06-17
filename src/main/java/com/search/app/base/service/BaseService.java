package com.search.app.base.service;

import java.util.List;

import com.search.app.bo.ResponseBO;
import com.search.app.util.Utils;


/**
 * This class is used for common method of service class
 * 
 * @author Ajay Agrawal
 *
 */
public class BaseService {

//	@Autowired
//	private IUserDAO iUserDAO;

	/**
	 * Prepare the Object of Response with Pagination Details
	 * 
	 * @param list
	 * @param listSize
	 * @param current_page
	 * @param limit
	 * @return
	 */
	public ResponseBO generatePaginationResponse(List<?> list, long listSize, int current_page, int limit) {
		ResponseBO responseBO = new ResponseBO();
		responseBO.setList(list);
		responseBO.setPagination(Utils.getPagination(current_page, listSize, limit));
		return responseBO;
	}


	
}
