package md.cibric.java_core1.lesson2;

public class HomeWorkApp2 {

    public static void main(String[] args) {

        checkTheSum(17,8);
        System.out.println("Полученная сумма лежит между 10 и 20? " + checkTheSum(17,8));
        isPositiveOrNegative(-33);
        System.out.println(isNegative(54));
        printTheWords("Karl Lagerfeld", 5);
        System.out.println("Этот год високосный? " + isLeapYear(2157));


    }

    private static boolean checkTheSum(int a, int b) {
        int sum = a + b;
        return sum <= 20 && sum >=10;
    }

    private static void isPositiveOrNegative(int w) {
        if (w >= 0) {
            System.out.println("Your number is positive ");
        } else {
            System.out.println("Your number is negative");
        }
    }

    private static boolean isNegative(int z)  {
        if (z < 0) {
            return true;
        } else{
            return false;
        }
    }

    private static void printTheWords(String m, int n) {
        for (int v = 0; v < n; v++) {
            System.out.println(m);
        }

    }

    private static boolean isLeapYear(int an){
        boolean result = false;

        if (an % 4 == 0 && an % 100 != 0) {
            result = true;
        } else if (an % 400 == 0) {
            result = true;
        }
        return result;
    }

}
