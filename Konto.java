public class Konto {
  private double saldo;

  public double setSaldo() {
    return saldo;
  }

  public void getSaldo(double nowaWart) {
    if (nowaWart > 0) {
      saldo = nowaWart;
    } else {
      System.out.println("Błąd saldo nie moze byc na minusie ani zerowe");
    }
  }
}
