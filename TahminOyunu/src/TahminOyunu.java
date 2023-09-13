import java.util.Random;
import java.util.Scanner;

public class TahminOyunu {
  public static void main(String[] args) {
    // Rastgele bir sayı üretme
    Random rand = new Random();
    int rastgeleSayi = rand.nextInt(100) + 1; // 1 ile 100 arasında rastgele bir sayı

    // Kullanıcıdan tahminleri almak için bir tarama (Scanner) nesnesi oluşturma
    Scanner scanner = new Scanner(System.in);

    int tahminSayisi = 0;
    boolean dogruTahmin = false;

    System.out.println("1 ile 100 arasında bir sayıyı tahmin edin.");

    while (!dogruTahmin) {
      System.out.print("Tahmininizi girin: ");
      int tahmin = scanner.nextInt();
      tahminSayisi++;

      if (tahmin < rastgeleSayi) {
        System.out.println("Daha büyük bir sayı tahmin edin.");
      } else if (tahmin > rastgeleSayi) {
        System.out.println("Daha küçük bir sayı tahmin edin.");
      } else {
        dogruTahmin = true;
        System.out.println("Tebrikler! " + tahminSayisi + " tahminde doğru bildiniz.");
      }
    }

    // Tarama nesnesini kapatma
    scanner.close();
  }
}
