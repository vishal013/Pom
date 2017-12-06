package com.makeMyTripTestCase;

import org.junit.Assert;

public class Rough {

	public static String value;

	public static void main(String[] args) {
		value = "1 Organization";
		value = value.replaceAll("Organization", "").trim();
		System.out.println(value);
		int value1 = Integer.parseInt(value);
		System.out.println(value1);
		value1 = value1 + 1;
		System.out.println(value1);
	
		int value2=12;
				 String str1 = Integer.toString(value2);		
		
				 System.out.println(str1);
				 
				 //value = value1.to
		// StringBuilder sb = new StringBuilder();
		// sb.append("");
		// sb.append(value);
		// String strI = sb.toString();
		//
		// String value2 = "2 Organizations";
		// if (value2.contains("Organizations")){
		// value2 = value2.replaceAll("Organization", "").trim();
		// }
		// else if (value2.contains("Organizations")){
		// value2 = value2.replaceAll("Organizations", "").trim();
		// }
		// value2 = value2.replaceAll("Organization", "").trim();
		// Assert.assertEquals(value1, value2);

	}

}
