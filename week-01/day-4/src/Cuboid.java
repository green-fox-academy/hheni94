public class Cuboid {
    public static void main(String[] args) {

        double a = 20;
        double b = 25;
        double c = 32;

        double surface = (2*(a*b) + 2*(a*c) + 2*(b*c));
        double volume = (a*b*c);

        System.out.println("Surface Area: " + surface);
        System.out.println("Volume: " + volume);
    }
}
