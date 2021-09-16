package classes;

import java.util.Arrays;
import java.util.List;

public class UseDates {
  public static void main(String[] args) {
    System.out.println(Date.isALeapYear(2020));
    System.out.println(Date.asText(16, 9, 2021));

//    Date today = new Date();
//    today.day = 16;
    // uninitialized objects are a bad idea anyway!
//    Date when = new Date(); // as right now, creates 0/0/0

    Date today = new Date(16, 9, 2021);

//    System.out.println(Date.asText(today.day, today.month, today.year));
    System.out.println(Date.asText(today));
    System.out.println(today.asText());

    List<Integer> daysToTry = Arrays.asList(12, 34, 10);

    for (int d : daysToTry) {
      try {
        Date theDate = new Date(d, 9, 2021);
        System.out.println(theDate.asText());
      } catch (IllegalArgumentException iae) {
        System.out.println("oops, that broke with " + iae);
      }
    }

    System.out.println("Today is still " + today.asText());
//    today.day = 100;
//    today.setDay(100);
    today.setDay(10);
    System.out.println("Today is still " + today.asText());

    Date nyd = new Holiday(1, 1, "New Year's Day");
    System.out.println("holiday is " + nyd.asText());
    System.out.println("holiday is " + nyd);
  }
}
