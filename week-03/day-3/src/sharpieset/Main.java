package sharpieset;

public class Main {
  public static void main(String[] args) {

    SharpieSet sharpieSet = new SharpieSet();
    sharpieSet.add(new Sharpie("blue", 10));
    sharpieSet.add(new Sharpie("green", 15));

    sharpieSet.countUsable();
    sharpieSet.removeTrash();
  }
}
