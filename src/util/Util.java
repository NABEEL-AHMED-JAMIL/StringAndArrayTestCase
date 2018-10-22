package util;

import java.util.*;

import static java.lang.System.*;

public class Util {

    public static UUID getUuid() {
        return UUID.randomUUID();
    }

    public static Date getDateInTimeZone(Date currentDate, String timeZoneId) {

        Calendar mbCal = new GregorianCalendar(TimeZone.getTimeZone(timeZoneId));
        mbCal.setTimeInMillis(currentDate.getTime());

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, mbCal.get(Calendar.YEAR));
        cal.set(Calendar.MONTH, mbCal.get(Calendar.MONTH));
        cal.set(Calendar.DAY_OF_MONTH, mbCal.get(Calendar.DAY_OF_MONTH));
        cal.set(Calendar.HOUR_OF_DAY, mbCal.get(Calendar.HOUR_OF_DAY));
        cal.set(Calendar.MINUTE, mbCal.get(Calendar.MINUTE));
        cal.set(Calendar.SECOND, mbCal.get(Calendar.SECOND));
        cal.set(Calendar.MILLISECOND, mbCal.get(Calendar.MILLISECOND));

        return cal.getTime();
    }

    public static Date getDateForPreviousDay(Date currentDate) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(currentDate);
        cal.add(Calendar.DATE, -1);
        return cal.getTime();
    }

    public static Date getDateForNextDay(Date currentDate) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(currentDate);
        cal.add(Calendar.DATE, +1);
        return cal.getTime();
    }

    public static String mongoEscape(String input, Character replaceChar, Character withChar) {
        return input.replaceAll("\\.", "_,_").replaceAll("^$", "_$_");
    }


    public static String mongoUnEscape(String input) {
        return input.replaceAll("_,_", "\\.").replaceAll("_$_", "^$");
    }

    public static void main(String args[]) {
        String input = "Pàkiétan";
        System.out.println(input =input.replace('é', 'S'));
        System.out.println(input.replace('à', 'S'));


        String inputtest = "Pàkiééééééééééétan125555";
        System.out.println(inputtest.replaceAll("é", "A"));

//        HashMap<UUID, Integer> uuIdMap = new HashMap<>();
//        while (true) {
//            UUID uuid = getUuid();
//            if(uuIdMap.containsKey(uuid)) {
//                out.println("========================");
//                uuIdMap.put(uuid, uuIdMap.get(uuid) + 1);
//                out.println("========================");
//            }else {
//                uuIdMap.put(uuid, 1);
//                out.println(uuid);
//            }
//        }
    }
}
