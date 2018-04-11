package com.util;

import java.util.regex.Pattern;

public class ValidUtil {

	  /**
     * ������ʽ����֤�û���
     */
    public static final String REGEX_USERNAME = "^[a-zA-Z]\\w{5,20}$";
 
    /**
     * ������ʽ����֤����
     */
    public static final String REGEX_PASSWORD = "^[a-zA-Z0-9]{6,20}$";
 
    /**
     * ������ʽ����֤�ֻ���
     */
    public static final String REGEX_MOBILE = "^((17[0-9])|(14[0-9])|(13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$";
 
    /**
     * ������ʽ:��֤�̶��绰
     */
    private static final String REGEX_PHONE="^(0\\d{2}-\\d{8}(-\\d{1,4})?)|(0\\d{3}-\\d{7,8}(-\\d{1,4})?)$";
    
    /**
     * ������ʽ����֤����
     */
    public static final String REGEX_EMAIL = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
 
    /**
     * ������ʽ����֤����
     */
    public static final String REGEX_CHINESE = "^[\u4e00-\u9fa5],{0,}$";
 
    /**
     * ������ʽ����֤���֤
     */
    public static final String REGEX_ID_CARD = "(^\\d{18}$)|(^\\d{15}$)";
 
    /**
     * ������ʽ����֤URL
     */
    public static final String REGEX_URL = "http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\w- ./?%&=]*)?";
 
    /**
     * ������ʽ����֤IP��ַ
     */
    public static final String REGEX_IP_ADDR = "(25[0-5]|2[0-4]\\d|[0-1]\\d{2}|[1-9]?\\d)";
	
    
    public static boolean isPhone(String phone){
    	return Pattern.matches(REGEX_PHONE, phone);
    }
    
    
    public static boolean isMobile(String mobile){
    	return Pattern.matches(REGEX_MOBILE, mobile);
    }
    
}
