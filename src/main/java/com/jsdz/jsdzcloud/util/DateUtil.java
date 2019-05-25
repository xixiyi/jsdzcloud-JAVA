package com.jsdz.jsdzcloud.util;

import java.text.SimpleDateFormat;
import java.util.Date;


public class DateUtil {
	private static SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
	
	public static String dates(){
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
        String dateString = formatter.format(currentTime);
        return dateString;
   }
	public static String shifentime(){
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        return dateString;
   }
	public static String shifentimeAddten(){
        
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date currentTime = new Date();
        Date afterDate = new Date(currentTime .getTime() + 600000);
        String dateString = formatter.format(afterDate);
        return dateString;
   }
	public static String datestr(){
		Date date = new Date();
		String datestr= DateToString(date);
		return datestr;
	}
	
	public static String DateToString(Date date){
		return sm.format(date);
	}


}
