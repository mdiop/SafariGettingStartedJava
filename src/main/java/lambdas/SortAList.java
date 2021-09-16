package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class StringByLength implements Comparator<String> {
  @Override
  public int compare(String o1, String o2) {
    return Integer.compare(o1.length(), o2.length());
  }
}

public class SortAList {
  public static void main(String[] args) {
    List<String> names = new ArrayList<>(Arrays.asList(
        "Fred", "Alice", "Jim", "Sheila", "Mark", "William"));
    System.out.println(names);
    names.sort(new StringByLength());

    System.out.println(names);

    names.sort((String o1, String o2) -> {
      return Integer.compare(o2.length(), o1.length());
    });
    System.out.println(names);


    names.sort((o1, o2) -> Integer.compare(o2.length(), o1.length()));
    System.out.println(names);
  }
}
