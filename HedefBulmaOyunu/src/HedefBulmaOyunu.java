/*
*
* import java.util.Scanner;

public class HedefBulmaOyunu {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Oyuncu oyuncu = new Oyuncu();
    Hedef hedef = new Hedef();

    System.out.println("Hedef Bulma Oyununa Hoş Geldiniz!");

    while (true) {
      System.out.println("Oyuncu Konumu: X = " + oyuncu.getX() + ", Y = " + oyuncu.getY());
      System.out.println("Hedef Konumu: X = " + hedef.getX() + ", Y = " + hedef.getY());
      System.out.print("Yön Seçin (Yukarı: W, Aşağı: S, Sol: A, Sağ: D, Çıkış: Q): ");
      String yon = scanner.next();

      if (yon.equalsIgnoreCase("Q")) { // `equalsIgnoreCase` büyük küçük harf dikkate alınmaz !
        System.out.println("Oyunu İptal Ettiniz.");
        break;
      }

      int deltaX = 0;
      int deltaY = 0;

      switch (yon.toUpperCase()) {
        case "W":
          deltaY = -1;
          break;
        case "S":
          deltaY = 1;
          break;
        case "A":
          deltaX = -1;
          break;
        case "D":
          deltaX = 1;
          break;
        default:
          System.out.println("Geçersiz Yön! Tekrar deneyin.");
          continue;
      }

      oyuncu.hareketEt(deltaX, deltaY);

      System.out.println("Oyuncu Yeni Konumu: X = " + oyuncu.getX() + ", Y = " + oyuncu.getY());


      if (oyuncu.getX() == hedef.getX() && oyuncu.getY() == hedef.getY()) {
        System.out.println("Tebrikler! Hedefi Buldunuz!");
        break;
      }
    }

    scanner.close();
  }
}

*
* */
