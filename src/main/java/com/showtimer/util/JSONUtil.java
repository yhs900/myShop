package com.showtimer.util;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

public class JSONUtil {
	private JSONUtil() {
	}

	private static Gson gson = null;

	static {
		gson = new Gson();// todo yyyy-MM-dd HH:mm:ss
	}

	public static synchronized Gson newInstance() {
		if (gson == null) {
			gson = new Gson();
		}
		return gson;
	}

	/**
	 * 对象转换成json字符串
	 * 
	 * @param obj
	 * @return
	 */
	public static String toJson(Object obj) {
		return gson.toJson(obj);
	}

	/**
	 * json字符串转成对象
	 * 
	 * @param str
	 * @param type
	 * @return
	 */
	public static <T> T fromJson(String str, Type type) {
		return gson.fromJson(str, type);
	}

	/**
	 * json字符串转成对象
	 * 
	 * @param str
	 * @param type
	 * @return
	 */
	public static <T> T fromJson(String str, Class<T> type) {
		return gson.fromJson(str, type);
	}

	public static <T> T toBean(String json, Class<T> clz) {

		return gson.fromJson(json, clz);
	}

	public static <T> Map<String, T> toMap(String json, Class<T> clz) {
		Map<String, JsonObject> map = gson.fromJson(json, new TypeToken<Map<String, JsonObject>>() {
		}.getType());
		Map<String, T> result = new HashMap<String, T>();
		for (String key : map.keySet()) {
			result.put(key, gson.fromJson(map.get(key), clz));
		}
		return result;
	}

	public static Map<String, Object> toMap(String json) {
		Map<String, Object> map = gson.fromJson(json, new TypeToken<Map<String, Object>>() {
		}.getType());
		return map;
	}

	public static <T> List<T> toList(String json, Class<T> clz) {
		JsonArray array = new JsonParser().parse(json).getAsJsonArray();
		List<T> list = new ArrayList<T>();
		for (final JsonElement elem : array) {
			list.add(gson.fromJson(elem, clz));
		}
		return list;
	}

}
