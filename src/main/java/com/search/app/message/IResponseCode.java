package com.search.app.message;

public interface IResponseCode {
	
	/**
	 * HTTP Status Codes
	 */
	int SUCCESS = 200;
	int DATA_NOT_FOUND = 204;
	int UNAUTHORIZED = 401;
	int SERVER_ERROR = 501;

	/**
	 * Custom Status Codes
	 */
	int EXISTING_ENTITY = 1001;
	int INVALID_ENTITY = 1002;
	int INVALID_STATUS = 1003;
	int INVALID_DATA = 1004;
	int USER_NOT_FOUND = 1005;
	int USER_ALREADY_DELETED = 1006;
	int LOGGER_NOT_FOUND = 1007;
	int EXPLODER_NOT_FOUND = 1008;
	int SITE_NOT_FOUND=1009;
	int ALREADY_ACTIVE = 1010;
	int INVALID_TOKEN = 1011;
	int INVALID_DEVICEID = 1012;

	

}
