public class Robot {
  String model;
  int poziomBaterii;

  public Robot(String model, int poziomBaterii) {
    this.model = model;
    this.poziomBaterii = poziomBaterii;
  }

  public void przedstawSie() {
    System.out.println("Jestem " + model + " Mam poizom baterii równy : " + poziomBaterii + "%");
  }

  public static void main(String[] args) {
    Robot robot1 = new Robot("kaai", 100);
    robot1.przedstawSie();
  }
}
