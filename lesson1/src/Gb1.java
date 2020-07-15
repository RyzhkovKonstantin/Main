public class Gb1 {
    public static void main(String[] args) {
        System.out.println(method1(10, 4, 20, 5));
        System.out.println(method2(10, 20));
        method3(20);
        System.out.println(method4(25));
        method5();
        method6(2011);


        byte a = 1;
        int a1 = 20;
        long a2 = 112233;
        float d1 = 2.25f;
        double d2 = 2.25;
        short s = 2;
        char c = '3';
        boolean b = true;
    }

    //3.
    public static float method1(float a, float b, float c, float d) {

        float res = a * (b + (c / d));
        return res;
    }

    //4.
    public static boolean method2(int a, int b) {

        if (a + b < 10 && a + b > 20) {
            return false;
        }
        return true;
    }

    //5.
    public static void method3(int a) {

        if (a < 0) {
            System.out.println("Число отрицательное.");
        } else System.out.println("Число положительное.");
    }

    //6.
    public static boolean method4(int a) {
        return a < 0;
    }

    //7.
    public static void method5() {
        System.out.println("Привет, я Костя!");
    }

    //8.
    public static void method6(int year){
        if (year % 100 != 0 && year % 4 == 0 || year % 400 == 0){
            System.out.println("Год високосный");
        } else System.out.println("Год не високосный");
    }

}
