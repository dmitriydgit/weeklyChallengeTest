import java.util.List;

public class App {
  public static void main(String[] args) {

    final List<String> liste = List.of("cat", "btt", "hat", "tree");
    //final List<String> liste = List.of("hello", "world", "challenge");

    final String chars = "batach";
    //final String chars = "welldonehopper";

    System.out.println("\n" + chars);
    System.out.println("\n" + getOutput(liste, chars));
   



  }

  private static String getOutput(List<String> liste, String chars) {
    return liste.stream()
        .filter(el -> pruefeElement(el, chars))
        .map(
            s -> {
              System.out.println(s + " (" + s.length() + ")");
              return s.length();
            })
        .reduce(0, Integer::sum)
        .toString();
  }

  public static boolean pruefeElement(String el, String chars) {
    for (int i = 0; i <= el.length() - 1; i++) {
      chars.toLowerCase();
      el.toLowerCase();
      if (chars.indexOf(el.chars().toArray()[i]) == -1) {
        return false;
      }
    }
    return true;
  }
}
