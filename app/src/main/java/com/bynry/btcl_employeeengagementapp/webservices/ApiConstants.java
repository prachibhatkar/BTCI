package com.bynry.btcl_employeeengagementapp.webservices;


public class ApiConstants
{

    public static final String DOMAIN_URL = "http://52.66.133.35"; //  UAT


    public static final String BASE_URL = DOMAIN_URL+"/mobileapp/";

    public static final int LOG_STATUS = 1; // TODO Please Make Sure that While creating signed APK make this value to "1"

    public static final String USER_ID = "user_id";
    public static final String DEVICE_TOKEN = "device_token";
    public static final String DEVICE_TYPE = "device_type";

    public static final String SIGNUP_URL = BASE_URL + "signup/";
    public static final String LOGIN_URL = BASE_URL + "consumer-login/";


    //For Volley
    public static final String LOGIN = "1";



}
