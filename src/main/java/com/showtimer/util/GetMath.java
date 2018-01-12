package com.showtimer.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GetMath {
    public static GetMath getMath = new GetMath();
    
    public static GetMath getInstace()
    {
    	return getMath;
    }
    
    public String  getMasNumber()
    {
    	SimpleDateFormat dFormat = new SimpleDateFormat("yyyyMMdd");
    	String number = dFormat.format(new Date());
    	return number + Integer.toString((int)(Math.random()*(9999-1000+1))+1000);
    }
}
