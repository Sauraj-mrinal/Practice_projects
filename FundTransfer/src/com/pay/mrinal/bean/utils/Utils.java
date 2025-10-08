package com.pay.mrinal.bean.utils;

import java.util.Random;
//import java.util.Timestamp;
public class Utils {
  
	// generate 11 digit pin code ____________
	
		public static String generateAcNum() {
			
			Random rnd = new Random();
			int part1 = rnd.nextInt(654321);
			int part2 = rnd.nextInt(99999);
			return String.valueOf(part1+""+part2);
		}
		
//		public static String getTimestamp() {
//			Timestampm timestamp = new Timestamp(System.currentTimeMillis());
//			return String.valueOf(timestamp);
//		}
}
