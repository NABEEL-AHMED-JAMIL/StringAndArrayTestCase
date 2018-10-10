package util;

public class IPAddressUtil {

    public static String iPV4(String ip) {
        if (ip.contains(".")) {
            switch (ip.split("\\.").length) {
                case 1:
                    ip += ".1.1.1";
                case 2:
                    ip += ".1.1";
                case 3:
                    ip += ".1";
            }
            return ip;
        }
        return ip;
    }

    public static String iPV6(String ip) {
        if (ip.contains(".")) {
            switch (ip.split("\\.").length) {
            }
        }
        return null;
    }
}
