package postit;

import java.awt.*;

public class Main {
  public static void main(String[] args) {

    PostIt first = new PostIt(Color.ORANGE, "Idea 1", Color.BLUE);
    //first.background = Color.orange;
    //first.textColor = Color.BLUE;
    //first.text = "Idea 1";

    PostIt second = new PostIt(Color.PINK, "Awesome", Color.BLACK);
    PostIt third = new PostIt(Color.YELLOW, "Superb!", Color.GREEN);
  }
}
