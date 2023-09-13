import java.util.Random;

public class Oyuncu {
  private int x;
  private int y;

  public Oyuncu() {
    x = 0;
    y = 0;
  }

  public void hareketEt(int deltaX, int deltaY) {
    x += deltaX;
    y += deltaY;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }
}

class Hedef {
  private int x;
  private int y;

  public Hedef() {
    Random rand = new Random();
    x = rand.nextInt(10);
    y = rand.nextInt(10);
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }
}
