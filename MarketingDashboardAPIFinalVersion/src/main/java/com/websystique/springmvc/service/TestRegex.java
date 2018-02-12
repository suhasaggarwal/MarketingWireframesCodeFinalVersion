package com.websystique.springmvc.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "campaignName:,6035489913829";
		Pattern p = Pattern.compile("(campaignName:)(.*)(,)", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(str);
		String result = m.replaceAll('"'+"campaignName"+'"'+":"+'"'+"$2"+'"'+","+'"');
	    System.out.println(result);
	
	
	}

}
