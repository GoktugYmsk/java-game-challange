package GetSetMethods.src;

public class Ogrenci {
  private String ad;
  private int yas;
  private String bolum;

  public Ogrenci(String ad, int yas, String bolum) {
    this.ad = ad;
    this.yas = yas;
    this.bolum = bolum;
  }

  public String getAd() {
    return ad;
  }

  public void setAd(String ad) {
    this.ad = ad;
  }

  public int getYas() {
    return yas;
  }

  public void setYas(int yas) {
    if (yas >= 0) {
      this.yas = yas;
    } else {
      System.out.println("Geçersiz yaş değeri!");
    }
  }

  public String getBolum() {
    return bolum;
  }

  public void setBolum(String bolum) {
    this.bolum = bolum;
  }

  public void bilgileriGoster() {
    System.out.println("Öğrenci Adı: " + ad);
    System.out.println("Öğrenci Yaşı: " + yas);
    System.out.println("Öğrenci Bölümü: " + bolum);
  }
}
