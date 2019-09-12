import java.sql.SQLOutput;

public class VariableMutation {
    public static void main(String[] args) {

        int a = 3;
        a += 10;
        System.out.println(a);

        int b = 100;
        b -= 7;
        System.out.println(b);

        int c = 44;
        c = c * 2;
        System.out.println(c);

        int d = 125;
        d = d / 5;
        System.out.println(d);

        int e = 8;
        System.out.println(Math.pow(e, 3));

        int f1 = 123;
        int f2 = 345;
        System.out.println(f1 > f2);

        int g1 = 350;
        int g2 = 200;
        int doubleG2 = g2 * 2;
        System.out.println(doubleG2 > g1);

        int h = 135798745;
        int divisor = 11;
        System.out.println((h % divisor) == 0); //Itt meg kell nézni, hogy a számom maradék nélkül osztható-e 11-el.

        int i1 = 10;
        int i2 = 3;
        int squared = i2 * 3;
        int cubed = squared * 3;
        System.out.println((i1 > squared) && (i1 < cubed));

        int j = 1521;
        int divisor1 = 3;
        int divisor2 = 5;
        System.out.println((j % divisor1) == 0 && (j % divisor2) == 0);
        System.out.println((j % divisor1) == 0 || (j % divisor2) == 0);
        }
    }

