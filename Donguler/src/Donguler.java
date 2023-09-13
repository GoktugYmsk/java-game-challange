public class Donguler {
  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      System.out.println("Döngü adımı: " + i);
    }

    int sayac = 0;
    while (sayac < 3) {
      System.out.println("While döngüsü adımı: " + sayac);
      sayac++;
    }
    int increment = 2;
    int decrement = 4;
    while (increment < 20) {
      System.out.println("Tur" + increment);
      increment++;
      decrement--;
      System.out.println("Decrement" + decrement);
    }
  }
}
