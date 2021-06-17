package com.search.app.base.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.search.app.bo.BaseResponseBO;


/**
 * Controller for Defining some basic Operations which will be accessible to all
 * Controllers All Module Controllers need to Extend this BaseController
 * 
 * @author Ajay Agrawal
 *
 */
public class BaseController {

	public ResponseEntity<BaseResponseBO> getResponseModel(Object responseObject, int status_code, String msgText, String username) {
		BaseResponseBO baseResponseModel = new BaseResponseBO();
		baseResponseModel.setResponse(responseObject);
		baseResponseModel.setMessage(msgText);
		baseResponseModel.setStatus_code(status_code);;
        //baseResponseModel.setIterabevaluaionListle(iterableObject);
		return new ResponseEntity<BaseResponseBO>(baseResponseModel, HttpStatus.OK);
	}
}
