package Lesson4;

public class Triangle {

    public static void main(String[] args) {

        square();

    }

    private static void square() {
        int a = 3;
        int b = 4;
        int c = 5;
        int p = 0;
        int s = 0;
        p = (a + b + c) / 2;
        s = (p*(p - a) * (p - b) * (p - c));

        System.out.println(Math.sqrt(s));
    }


}
