public class DefineBasicInfo {
    public static void main(String[] args) {

        String name = "Heni Havasi";
        int age = 25;
        double height = 1.68;
        boolean familyStatus = false;

        System.out.println("My name is: " + name);
        System.out.println("My age is: " + age);
        System.out.println("My height is: " + height);

        if (familyStatus)
            System.out.println("My family status is: married");
        else {
            System.out.println("My family status is: not married");
        }
    }
}
