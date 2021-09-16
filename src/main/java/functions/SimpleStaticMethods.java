package functions;

public class SimpleStaticMethods {

  public static boolean isALeapYear(int year) {
    return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
  }

  public static void main(String[] args) {

  }
}
