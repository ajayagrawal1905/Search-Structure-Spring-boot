package com.search.app.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.search.app.bo.Pagination;
import com.search.app.constants.EtmsConstants;

/**
 * 
 * @author Ajay Agrawal
 *
 */

public class Utils {
	
	/**
	 * Prepare the Pagination Object according to provided page count and limit
	 * 
	 * @param current_page
	 * @param count
	 * @param limit
	 * @return
	 */
	public static Pagination getPagination(int current_page, long count, int limit) {
		// get Page Count
		float pages = ((float) count / (float) limit);
		int page_count = (int) Math.ceil(pages);

		// check whether page have previous page
		boolean has_prev_page = true;
		if (current_page == 1) {
			has_prev_page = false;
		}

		// check whether page have next page
		boolean has_next_page = true;
		if (current_page >= page_count) {
			has_next_page = false;
		}

		// Set the Page Data
		Pagination pagination = new Pagination(page_count, current_page, has_next_page, has_prev_page, count,
				limit);

		return pagination;
	}

	
	/**
	 * Return Current date in "yyyy/MM/dd HH:mm:ss" this format
	 * 
	 * @return
	 */
	
	public static String getCurrentDateTime() {
		try {
			DateFormat dateFormat = new SimpleDateFormat(EtmsConstants.IDateTimeConstants.DATE_FORMAT);
			Date date = new Date();
			return dateFormat.format(date);
			// System.out.println(dateFormat.format(date)); //12:08:43
		} catch (Exception e) {
			return null;
		}
	
	}
	public static String getCurrentDateTimeMillis() {
		try {
			DateFormat dateFormat = new SimpleDateFormat(EtmsConstants.IDateTimeConstants.TIME_FORMAT);
			Date date = new Date();
			return dateFormat.format(date.getTime());
			// System.out.println(dateFormat.format(date)); //12:08:43
		} catch (Exception e) {
			return null;
		}
	
	}
}


