package util;

/**
 * Created by Nabeel on 1/30/2017.
 */
public class BooleanUtil {

    public static final Short TURE_SHORT = 1;
    public static final Short FALSE_SHORT = 0;

    /**
     * Note :- getBooleanValue
     * getBooleanValue = 1 more mean greater then 1 will return "true"
     * getBooleanValue = 0, null will return "false"
     * Thanks
     * */
    @Deprecated
    public static Boolean getBooleanValue(Short shortValue) { return shortValue != null ? (shortValue.shortValue() == getFalseShort() ? false : true) : false; }

    public static Boolean getBooleanValue_V2(Short shortValue) { return  shortValue != null && shortValue == getTureShort() ? true : false; }

    /**
     * Note :- getBooleanValue
     * check the value of bool and return same else in case of null
     * will return false
     * */
    private static Boolean getBooleanValue(Boolean boolValue) {
        return boolValue != null ? boolValue : false;
    }

    public static Short getShortValue(Boolean booleanValue) { return getBooleanValue(booleanValue) != false ? getTureShort() : getFalseShort(); }

    public static Short getTureShort() { return TURE_SHORT; }

    public static Short getFalseShort() { return FALSE_SHORT; }

}
