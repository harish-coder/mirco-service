package com.data.table.client.constant;

import org.springframework.util.StringUtils;

public class Util {

	private Util() {
	}
	
	
	public static String getSearchString(GenericSearchCriteria genericSearchCriteria){
		String searchString = "";
		if(!StringUtils.isEmpty(genericSearchCriteria.getSearchString())){
			searchString = searchString+ "'%"+genericSearchCriteria.getSearchString().toLowerCase()+"%'";
			return searchString;
		}
		return searchString+ "'%%'";
	}
	
}