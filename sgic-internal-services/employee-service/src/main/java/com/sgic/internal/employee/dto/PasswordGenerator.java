package com.sgic.internal.employee.dto;

import java.security.SecureRandom;
import java.util.Random;

public class PasswordGenerator {
	
	private static final Random RANDOM = new SecureRandom();
	  
	  public static final int PASSWORD_LENGTH = 10;
	 
	  public String generateRandomPassword()
	  {
	      
	      String letters = "abcdefghjkmnpqrstuvwxyzABCDEFGHJKMNPQRSTUVWXYZ23456789+@";

	      String password = "";
	      for (int i=0; i<PASSWORD_LENGTH; i++)
	      {
	          int index = (int)(RANDOM.nextDouble()*letters.length());
	          password += letters.substring(index, index+1);
	      }
	      return password;
	  }

}
