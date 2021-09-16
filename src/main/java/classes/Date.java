package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Date /*extends Object */{
  class Extra{} // this has access to private members in Date (and vice versa)
  // private (in Java) means "only accessible inside the ENCLOSING TOP LEVEL curly braces"
  private int day;
  private int month;
  private int year;

  public int getDay() {
    return day;
  }

  public void setDay(int day) {
    if (day < 1 || day > 31) throw new IllegalArgumentException("Bad day");
    this.day = day;
  }

  public int getMonth() {
    return month;
  }

  public void setMonth(int month) {
    if (month < 1 || month > 12) throw new IllegalArgumentException("Bad month");
    this.month = month;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }
// explicit constructor equivalent to default construtor
  // NOTE default constructor is created by compiler ONLY if
  // we do not code ANY constructors ourselves
//  public Date() {}

  // NO RETURN TYPE specified for a "constructor"
  public Date(int day, int month, int y) {
    if (day < 1 || day > 31 || month < 1 || month > 12) {
      throw new IllegalArgumentException("Bad date");
    }
    // initialize an object called this (this is equivalent to self in Python and smalltalk)
    this.day = day;
    this.month = month;
    year = y; // this.year is implicit when unambiguous (differs from JavaScript / Python)
  }

  public static boolean isALeapYear() {
    return isALeapYear(2021);
  }

  public static boolean isALeapYear(int year) {
    return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
  }

  public static int dayOfWeekFromCal(int day, int month, int year) {
    year = (month < 3) ? year - 1 : year;
    month = (month < 3) ? month + 12 : month;
    return (day + (13 * (month + 1) / 5) + year + year / 4 - year / 100 + year / 400) % 7;
  }

  public static List<String> dayNames = new ArrayList<>(Arrays.asList(
      "Saturday", "Sunday", "Monday", "Tuesday", /*LocalDate.now(),*/
      "Wednesday","Thursday", "Friday"
  ));

  public static String dayNumToName(int dayNum) {
    return dayNames.get(dayNum); // will throw an exeption for illegal subscript
  }

  public static String asText(Date d) {
    System.out.println("invoking static version of asText");
    return asText(d.day, d.month, d.year);
  }

//  public /*static*/ String asText(Date this) {
  public String asText() {
    System.out.println("invoking instance version of asText");
    return asText(this.day, this.month, this.year);
  }

  @Override
  public String toString() {
//    return this.asText();
    return asText();
  }

  public static String asText(int day, int month, int year) {
    return "Date: " + dayNumToName(dayOfWeekFromCal(day, month, year))
        + " " + day + " / " + month + " / " + year;
  }
}
