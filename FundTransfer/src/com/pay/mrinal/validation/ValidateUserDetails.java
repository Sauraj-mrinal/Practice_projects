package com.pay.mrinal.validation;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.pay.mrinal.bean.User;
public class ValidateUserDetails {
	
	private static Matcher matcher;
	private static Pattern pattern;
	
	// for email pattern 
	private static final String EMAIL_PATTERN = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +
            "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
	// to validate email
	public static boolean validateEmail(String email) {
		pattern = pattern.compile(EMAIL_PATTERN);
		matcher = pattern.matcher(email);
		return matcher.matches();
	}
	
	
	
	// pincode check
	
	public static boolean varifyPin(String pin ,User user) {
		
		if(pin == user.getAccountPin()) {
			return true;
		}
		return false;
	}
	
   public static boolean checkLength(int length, String text, boolean lengthEquals) {
	
	   
	   if(lengthEquals) {
		   if(text.length()==length && text != null) {
			   return true ;
		   }else {
		   return false;
	   }
	   
	   }else {
		   if(text.length()>length && text !=null) {
			   return true;
		   }else {
			   return false;
		   }
	   }
   }
	   //--------------------------------------------------------------
	  public static boolean isNotNull(String txt) {
		  return txt !=null && txt.trim().length()>0 ? true : false;
	  }
	  
	  // validate password  with retype
	  
	  public static boolean validatePassword(String pass) {
		  if(pass !=null && pass.length() >3) {
			  return true;
		  }
		  return false;
	  }
	  
	  //------------
	  public static boolean haveSpace(String userName ) {
		  
		  boolean checkSpace = false;
		  int f =0;
		  for(int i=0; i< userName.length(); i++) {
			  if(userName.contains(" ")) {
				  f=1;
				  checkSpace = true;
			  }
		  }
		  if(f==1) {
			  return checkSpace;
		  }else {
			  return checkSpace;
		  }
	  }
	  //---------------------------
	  
	  public static boolean validateMaxMobile(String mobile) {
		  
		  return mobile != null && mobile.length()>=10 ? true :false ;
				 
	  }
	  //---------------
	  public static boolean validateMinMobile( String mobile) {
		  return mobile !=null && mobile.length() <=10 ? true : false;
	  }
	 
	  
	  
	  
}
