package reference;

public class EqualityComparisons {
  public static void main(String[] args) {
//    java.lang.String
    String s = "Hello";
    String t = " World!";
    String u = s + t;

    System.out.println("The message is " + s + t);

    System.out.println("I would like " + 3 + " bananas");
    int x = 3;
    int y = 7;
    System.out.println("sum is " + x + y);
    System.out.println("sum is " + (x + y));
    System.out.println(x + y + " is the sum");

    System.out.println(x == y);
    int z = 7;
    System.out.println(y == z);

    String v = "Hello World!";
    System.out.println(u);
    System.out.println(v);
    System.out.println("u == v? " + (u == v));

    // Strings have a special property: They are IMMUTABLE (they NEVER change)
//    v.toUpperCase(); // does NOT change the original string, it makes a NEW ONE
//    v = v.toUpperCase();
    String w = v.toUpperCase();
    System.out.println("v after toUpperCase " + v);
    System.out.println("w after toUpperCase " + w);

    // if you have IMMUTABLE data, you can safely share it.
    String a = "Hello";
    String b = "Hello";
    // identical string literals are always shared!!!
    // for more cool tricks, check out String intern...
    System.out.println("a == b? " + (a == b));

    // to compare the contents of two objects
    // Java generally provides the equals method
    // This ONLY WORKS in specific classes
    // equals is inherited from java.lang.Object which is the base of everything
    System.out.println("u.equals(v)? " + u.equals(v));

    // StringBuilder is MUTABLE (we can change them)
    StringBuilder sb1 = new StringBuilder("Hello");
    StringBuilder sb2 = new StringBuilder("Hello");
    System.out.println("sb1 == sb2? " + (sb1 == sb2));
    System.out.println("sb1.equals(sb2)? " + (sb1.equals(sb2)));
  }
}
