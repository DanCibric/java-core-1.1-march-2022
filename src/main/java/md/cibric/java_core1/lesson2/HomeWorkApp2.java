package md.cibric.java_core1.lesson2;

public class HomeWorkApp2 {

    public static void main(String[] args) {

        checkTheSum(7,8);
        System.out.println("Полученная сумма лежит между 10 и 20? " + checkTheSum(17,8));


    }

    private static boolean checkTheSum(int a, int b) {
        int sum = a + b;
        return sum <= 20 && sum >=10;
    }

}
