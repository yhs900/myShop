package com.showtimer.result;


public class JsonResult {
	
	private String code;
	private String message;
	private Object data;

	public JsonResult() {
		this.setCode(ResultCode.SUCCESS);
		this.setMessage("成功！");
		
	}
	
	public static JsonResult createFronResponse(ResultCode code, String message)
	{
		return new JsonResult(code, message);
	}
	
	
	public static JsonResult createFronResponse(ResultCode code)
	{
		return new JsonResult(code);
	}
	
	public static JsonResult createFronResponse(ResultCode code, String message, Object data)
	{
		return new JsonResult(code, message, data);
	}
	
	public JsonResult(ResultCode code) {
		this.setCode(code);
		this.setMessage(code.msg());
	}
	
	public JsonResult(ResultCode code, String message) {
		this.setCode(code);
		this.setMessage(message);
	}
	
	public JsonResult(ResultCode code, String message, Object data) {
		this.setCode(code);
		this.setMessage(message);
		this.setData(data);
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(ResultCode code) {
		this.code = code.val();
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
