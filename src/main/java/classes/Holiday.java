package classes;

public class Holiday extends Date {
  private String name;
  public Holiday(int day, int month, String name) {
    super(day, month, 2021);
    this.name = name;
  }

  @Override
  public String asText() {
    return "I'm a holiday called " + name;
  }

  @Override // annotation ONLY elicits an error if not really an override.
  // DOES NOT change behavior at all
  public String toString() {
    System.out.println("In Holiday.toString");
    return this.asText();
  }
}
