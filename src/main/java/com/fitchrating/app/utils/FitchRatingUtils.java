package com.fitchrating.app.utils;

import java.util.Date;

public class FitchRatingUtils {

 @SuppressWarnings("deprecation")	
 public static String getTimeZoneWithDateForMongo(){
		final String formatter = new Date().toGMTString();
		return formatter;
		
  }
}
