package GetSetMethods.src;

import java.util.Scanner;

public class MainOgrenci {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Öğrencinin adını giriniz: ");
    String ad = scanner.nextLine();

    System.out.print("Öğrencinin yaşını giriniz: ");
    int yas = scanner.nextInt();
    scanner.nextLine(); // Enter tuşuna basıldığında yeni satır karakterini temizle

    System.out.print("Öğrencinin bölümünü giriniz: ");
    String bolum = scanner.nextLine();

    Ogrenci ogrenci1 = new Ogrenci(ad, yas, bolum);

    // Öğrenci bilgilerini göstermek için metodu kullanabiliriz
    ogrenci1.bilgileriGoster();

    // Yaşını güncelleyebiliriz
    System.out.print("Yeni yaş bilgisini giriniz: ");
    int yeniYas = scanner.nextInt();
    ogrenci1.setYas(yeniYas);

    // Güncellenmiş bilgileri tekrar göstermek için metodu kullanabiliriz
    ogrenci1.bilgileriGoster();

    // Scanner'ı kapat
    scanner.close();
  }
}
