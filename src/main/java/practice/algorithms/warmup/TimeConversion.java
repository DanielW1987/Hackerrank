package practice.algorithms.warmup;

public class TimeConversion {

  public static void main(String[] args) {
    String s1 = "07:05:45PM";
    String s2 = "07:05:45AM";
    String s3 = "12:05:45PM";
    String s4 = "12:05:45AM";

    System.out.println(timeConversion(s1));
    System.out.println(timeConversion(s2));
    System.out.println(timeConversion(s3));
    System.out.println(timeConversion(s4));
  }

  private static String timeConversion(String s) {
    String[] timeParts = s.split(":");
    int hour           = Integer.valueOf(timeParts[0]);

    if (s.endsWith("AM") && hour == 12) {
      hour = 0;
    }
    else if (s.endsWith("PM") && hour != 12) {
      hour += 12;
    }

    return formatTime(Integer.toString(hour), timeParts[1], timeParts[2]).replace("AM", "").replace("PM", "");
  }

  private static String formatTime(String hour, String minute, String seconds) {
    if (hour.length() == 1) {
      hour = "0" + hour;
    }

    return String.format("%s:%s:%s", hour, minute, seconds);
  }

}