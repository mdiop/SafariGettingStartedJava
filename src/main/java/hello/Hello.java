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

    long z = 3_000_000_000L;
//    short s = 31567;
    short s = 3;
    short t = 4;
//    short u = s + t; // fails, result type is int
    short u = (short)(s + t); // casts can fix some problems

    // Java 10 introduces type inference for variable declaration
//    int a = 10;
//    var a = 10; // still produces an int variable
//    a = 1234L;
//    a = "Hello";
  }
}
