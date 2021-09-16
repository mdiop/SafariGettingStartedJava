package functions;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleStaticMethods {

  // java provides "method overloading"
  // the full name of any method includes the type-sequence of its arguments
  // BUT changing return type ONLY is NOT OK
  public static boolean isALeapYear() {
    return isALeapYear(2021);
  }

  public static boolean isALeapYear(int year) {
    return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
  }

//  public static boolean anyAreLeap(int [] years) {
//  public static boolean anyAreLeap(int ... years) {
//    for (int i = 0; i < years.length; i++) {
//      if (isALeapYear(years[i])) {
//        return true;
//      }
//    }
//    return false;
//  }

//  public static boolean anyAreLeap(int ... years) {
//    int i = 0;
//    while (i < years.length) {
//      if (isALeapYear(years[i])) {
//        return true;
//      }
//      i++;
//    }
//    return false;
//  }

  public static boolean anyAreLeap(int ... years) {
    for (int year : years) { // enhanced for loop -- there is NO INDEX
      if (isALeapYear(year)) {
        return true;
      }
    }
    return false;
  }

  // Zeller's congruence (see wikipedia)
  // Saturday = 0
  public static int dayOfWeekFromCal(int day, int month, int year) {
//    if (month < 3) {
//      month += 12; // month = month + 12;
////      year -= 1;
//      year--;
//    }
    year = (month < 3) ? year - 1 : year;
    month = (month < 3) ? month + 12 : month;
    return (day + (13 * (month + 1) / 5) + year + year / 4 - year / 100 + year / 400) % 7;
  }

//  public static List<String> dayNames = List.of(
//      "Saturday", "Sunday", "Monday", "Tuesday",
//      "Wednesday","Thursday", "Friday"
//  );

//  public static List<String> dayNames = Arrays.asList(
//      "Saturday", "Sunday", "Monday", "Tuesday",
//      "Wednesday","Thursday", "Friday"
//  );

  // ArrayList (also LinkedList) are MUTABLE lists (generally more useful)
//  public static List<String> dayNames = new ArrayList<String>(Arrays.asList(
  public static List<String> dayNames = new ArrayList<>(Arrays.asList(
      "Saturday", "Sunday", "Monday", "Tuesday", /*LocalDate.now(),*/
      "Wednesday","Thursday", "Friday"
  ));

// can't use generics with the 8 primitive types
//  public static List<int> bad; // NOT ALLOWED
//  public static List<Integer> good; // nearest hack :)

  public static String dayNumToName(int dayNum) {
    return dayNames.get(dayNum); // will throw an exeption for illegal subscript
  }

//  public static String dayNumToName(int dayNum) {
//    String name;
//    // traditional C-style switch (complete with break and fallthrough! yuk :)
//    switch (dayNum) { // switch on int (can promote smaller numeric types), String, enum
//      case 0: name = "Saturday"; break;
//      case 1: name = "Sunday"; break;
//      case 2: name = "Monday"; break;
//      case 3: name = "Tuesday"; break;
//      case 4: name = "Wednesday"; break;
//      case 5: name = "Thursday"; break;
//      case 6: name = "Friday"; break;
//        // Sentinel value, likely to cause downstream/consequential errors
////      default: name = "Unknown";
//      default: throw new IllegalArgumentException("Bad day number");
//    }
//    return name;
//  }

//  public static String dayNumToName(int dayNum) {
//    String name;
//    switch (dayNum) { // switch on int (can promote smaller numeric types), String, enum
//      case 0 -> name = "Saturday"; // no fallthrough with newer switch with arrow
//      case 1 -> name = "Sunday";
//      case 2 -> name = "Monday";
//      case 3 -> name = "Tuesday";
//      case 4 -> name = "Wednesday";
//      case 5 -> name = "Thursday";
//      case 6 -> name = "Friday";
//        // Sentinel value, likely to cause downstream/consequential errors
////      default: name = "Unknown";
//      default -> throw new IllegalArgumentException("Bad day number");
//    }
//    return name;
//  }

//  public static String dayNumToName(int dayNum) {
//    return switch (dayNum) { // switch on int (can promote smaller numeric types), String, enum
//      case 0 -> "Saturday";
//      case 1 -> "Sunday";
//      case 2 -> "Monday";
//      case 3 -> "Tuesday";
//      case 4 -> "Wednesday";
//      case 5 -> "Thursday";
//      case 6 -> "Friday";
//      default -> throw new IllegalArgumentException("Bad day number");
//    };
//  }

  public static void main(String[] args) {
//    boolean isLeap = functions.SimpleStaticMethods.isALeapYear(2020);
//    boolean isLeap = SimpleStaticMethods.isALeapYear(2020);
    boolean isLeap = isALeapYear(2020);
    System.out.println("2020 is leap? " + isLeap);
    System.out.println("2021 is leap? " + isALeapYear());

//    int [] years = new int[3]; // arrays are fixed length after creation
//    years[0] = 2021;
//    years[1] = 2022;
//    years[2] = 2023;

//    int [] years = new int[]{2021, 2022, 2023};

    int [] years = {2021, 2022, 2023};
    System.out.println("any leap years? " + anyAreLeap(years));
    System.out.println("any leap years? " + anyAreLeap(new int[]{2021, 2022, 2023}));
    System.out.println("any leap years? " + anyAreLeap(2021, 2022, 2023));

    System.out.println("Day of week of 16 sept (month 9) 2021 "
        + dayNumToName(dayOfWeekFromCal(16, 9, 2021)));
  }
}
