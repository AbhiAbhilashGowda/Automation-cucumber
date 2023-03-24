package com.automation.config;

public interface ConfigurationReader {
	
	public String getUrl();
	public String getBrowser();
	public int getPageLoadTimeOut();
	public String getUsername();
	public String getPassword();
	public String getInvalidUsername();
	public String getInvalidPassword();
	
	
}