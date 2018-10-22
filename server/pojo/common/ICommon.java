package com.ballistic.server.pojo.common;


public interface ICommon {

    public static String[] contentTypeRegx = {};
    public static String latitudeRegx = "";
    public static String longitudeRegx = "";

    public static enum Role { ADMIN, USER }
    public static enum Scope { READ, WRITE }
    public static enum ContentType { JPG, PNG }
    public static enum Gender { MALE, FEMALE }
    public static enum ContectType { HOME, MOBILE }

    public static String getDate() { return String.valueOf(System.currentTimeMillis()); }
}
