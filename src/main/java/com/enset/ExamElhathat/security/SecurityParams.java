package com.enset.ExamElhathat.security;



public class SecurityParams {
    public static final String JWT_SECRET = "mySecretKey123456";
    public static final long EXPIRATION_TIME = 864_000_000; // 10 jours
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
}

