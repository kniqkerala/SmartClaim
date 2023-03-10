package com.smartclaim.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
//Creating a constructor to invoke the properties file
	public ReadConfig()
	{
		File src = new File("./Configuration/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);

		} catch (Exception e) {
			System.out.println("Exception is" + e.getMessage());
		}
	}
	
	//Adding methods for each variables in base class  
	public String getApplicationURL()
	{
		String URL = pro.getProperty("baseURL");
		return URL;
	}
	public String getUserName()
	{
		String username = pro.getProperty("username");
		return username;
	}
	public String getPassword()
	{
		String password = pro.getProperty("password");
		return password;
	}
}
