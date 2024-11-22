public class Calculator {

    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 25;
        int sum = add(num1, num2);
        System.out.println("Addition of " + num1 + " and " + num2 + " is: " + sum);
        int difference = subtract(num1, num2);
        System.out.println("Subtraction of " + num1 + " and " + num2 + " is: " + difference);
    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
}
