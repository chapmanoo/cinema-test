package com.qa.util;

import com.google.gson.Gson;

public class JSONUtil {
	
	private Gson gson;
	
	public JSONUtil() {
		this.gson = new Gson();
	}
	
	public String getJSONFromObject (Object obj) {
		return gson.toJson(obj);
	}
	
	public <T> T getObjectFromJSON(String jsonString, Class<T> c) {
		return gson.fromJson(jsonString, c);
	}

}
