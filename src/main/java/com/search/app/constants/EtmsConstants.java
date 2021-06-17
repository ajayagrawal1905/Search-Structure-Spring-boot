package com.search.app.constants;


public interface EtmsConstants {
	
	public int STATUS_ACTIVE = 1;
	public int STATUS_INACTIVE = 0;
	public int VALUE_ONE = 1;
	public int VALUE_ZERO=0;
	public int DEFAULT = -1;
    public String STATUS="status";
	
	public int REQUEST_GENERATED = 1;
	public int REQUEST_APPROVED_TRAINING_HOD = 2;
	public int REQUEST_APPROVED_HIGHER_AUTH = 3;
	public int REQUEST_REJECTED_HIGHER_AUTH = 4;

	public int TRAINING_SCHEDULED = 1;
	public int TRAINING_COMPLETED = 2;

	
	public int APPROVED = 1;
	public int REJECTED = 2;
	
	
	public interface IURLConstants{
		public String SEARCH = "/search";
		public String HOME = "/home";

		

	}
	public interface IMappingConstants{
    public String SEARCH = "/search";
	
	}
	
	public interface IRequestParamConstants{
		 public String PAGE = "page";
		 public String LIMIT = "limit";	
	}

	public interface IDateTimeConstants{
	  public String DATE_FORMAT = "yyyy-MM-dd";
	  public String TIME_FORMAT = "HH:MM AA";
	}

	public interface ISecurityConstants {
		public String PASSWORD = "Test@1234";
		public String TOKEN_PREFIX = "Bearer ";
	}
}
