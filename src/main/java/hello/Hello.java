package hello;

// import of java.lang.*; is IMPLICIT
// imports must always be FULLY qualified.
//import java.lang.*;
//import java.lang.System;
// static imports are NEVER IMPLICIT
//import static java.lang.System.out;
//import static java.lang.System.*;

public class Hello {
  public static void main(String [] args) {
//    java.lang.System.out.println("Hello World!");
    System.out.println("Hello World!");
//    out.println("Hello World!");

    // variables must be declared before use
    // declare and initialize is preferred
    int x;
    int y = 100;
//    if (Math.random() >= 0) {
    if (y >= 0) {
      x = 99;
    } else {
      x = -100;
    }
    x = x + y; // + - * / %
    // division might produce integers or floating point
    // % is remainder, not "mod"
    // must INITIALIZE before reading
    System.out.println(x);
  }
}
