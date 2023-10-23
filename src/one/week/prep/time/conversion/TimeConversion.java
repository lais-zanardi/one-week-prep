package one.week.prep.time.conversion;

class Result {
    public static String timeConversion(String s) {
        if(s.endsWith("AM")) {
            int hh = Integer.parseInt(s.substring(0,2));
            if(hh == 12) {
                hh = 0;
            }
            String formattedHours = String.format("%02d", hh);
            String formattedTimeAM = formattedHours + s.substring(2,8);
           return formattedTimeAM;
        } else {
            int hh = Integer.parseInt(s.substring(0,2))+12;
            if(hh == 24) {
                hh = 12;
            }

            if(hh >24 && hh<=48) {
                hh = (hh - 24) %25;
            }
            String hours = String.format("%02d", hh);

            int mm = Integer.parseInt(s.substring(3,5));
            String minutes = String.format("%02d", mm);

            int ss = Integer.parseInt(s.substring(6,8));
            String seconds = String.format("%02d", ss);

            String formattedTimePM = hours + ":" + minutes + ":" + seconds;

           return formattedTimePM;
        }
    }
}
public class TimeConversion {
    public static void main(String[] args) {
        String s = "12:45:54PM";

        Result.timeConversion(s);
    }
}
