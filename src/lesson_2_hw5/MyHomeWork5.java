package lesson_2_hw5;

public class MyHomeWork5 {
    public static void main(String[] args) {
        getDoubleDigits();
    }
    public static void getDoubleDigits(){
        int q = 21;
        int w = 8;
        int lastDigit = q % w;

    System.out.println("21 % 8: " + lastDigit);
}
}