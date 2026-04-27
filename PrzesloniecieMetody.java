class Zwierze {
  void wydajDzwiek() {
    System.out.println("Dźwięk zwierzęcia");
  }
}

class Kot extends Zwierze {
  @Override
  void wydajDzwiek() {
    System.out.println("Hau Hau Miał Miał");
  }
}

public class PrzesloniecieMetody {
  public static void main(String[] args) {
    Zwierze z1 = new Zwierze();
    Zwierze z2 = new Kot();

    z1.wydajDzwiek();
    z2.wydajDzwiek();
  }
}
