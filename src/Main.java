public class Main {
    public static void main(String[] args) {

        task6();
        task7();
        task8();
        task6_lesson2();
    }


    public static void task6() {

        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;

        int result = a * (b + (c - d * e));
        result = -result;
        System.out.println(result);
    }

    public static void task7(){

        int a = 7;
        int b = 5;

        a = -a;
        b = -b;
        System.out.println (a);
        System.out.println(b);

        b = b - a;
        a = -a;
        System.out.println(a);
        System.out.println(b);
        a = a - b;
        b = b + a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void task8(){
        int a = 256;

        int  a1 = a % 100;
        int b = (a1 - (a1 % 10)) /10;
        System.out.println(b);
    }

    public static void task6_lesson2(){

        int age = 23;
        int salary = 80_000;



        if (age < 23) {
            int limit = salary * 2;

            if (salary >= 50_000 && salary < 80_000) {
                limit = (int) (limit * 1.2);
            }
            if (salary >= 80_000) {
                limit = (int) (limit * 1.5);}
            System.out.println("You were approved for " + limit + "rouble credit card");
        }

        if (age >= 23) {
            int limit = salary * 3;

            if (salary >= 50_000 && salary < 80_000) {
                limit = (int) (limit * 1.2);
            }
            if (salary >= 80_000) {
                limit = (int) (limit * 1.5);}
            System.out.println("You were approved for " + limit + " rouble credit card");
        }
    }



}


