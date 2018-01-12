package com.showtimer.domain;

import java.io.Serializable;

public class FSystemConfig implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5497396277464158902L;
	
	private String SYSTEM_NAME;
	private String SYSTEM_LOGO;
	private String LOGIN_SESSION_VALID;
	private String IDENTIFYING_CODE;
	public String getSYSTEM_NAME() {
		return SYSTEM_NAME;
	}
	public void setSYSTEM_NAME(String sYSTEM_NAME) {
		SYSTEM_NAME = sYSTEM_NAME;
	}
	public String getSYSTEM_LOGO() {
		return SYSTEM_LOGO;
	}
	public void setSYSTEM_LOGO(String sYSTEM_LOGO) {
		SYSTEM_LOGO = sYSTEM_LOGO;
	}
	public String getLOGIN_SESSION_VALID() {
		return LOGIN_SESSION_VALID;
	}
	public void setLOGIN_SESSION_VALID(String lOGIN_SESSION_VALID) {
		LOGIN_SESSION_VALID = lOGIN_SESSION_VALID;
	}
	public String getIDENTIFYING_CODE() {
		return IDENTIFYING_CODE;
	}
	public void setIDENTIFYING_CODE(String iDENTIFYING_CODE) {
		IDENTIFYING_CODE = iDENTIFYING_CODE;
	}
	
	
}
