import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Assignment #1 */
        System.out.println("\nMy name is Younis Mirani");

        //Assignment #2
        System.out.println("\nInput two numbers to do simple arithmetic");

        Scanner scanner = new Scanner(System.in);
        System.out.println("First number: ");
        double number1 = scanner.nextDouble();

        scanner = new Scanner(System.in);
        System.out.println("Second number: ");
        double number2 = scanner.nextDouble();

        double addingResult = number1 + number2;
        double subtractResult = number1 - number2;
        double multiplyResult = number1 * number2;
        double divisionResult = number1 / number2;


        System.out.println(number1+"+"+number2+"="+addingResult);
        System.out.println(number1+"-"+number2+"="+subtractResult);
        System.out.println(number1+"x"+number2+"="+multiplyResult);
        System.out.println(number1+"÷"+number2+"="+divisionResult);

        //Assignment #3
        scanner = new Scanner(System.in);
        System.out.print("input the radius of the circle: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * radius * radius;
        System.out.println("the area of the circle is :"+area);

        //Assignment #4
        scanner = new Scanner(System.in);
        System.out.print("input your minutes: ");
        int minutes = scanner.nextInt();
        int seconds = minutes * 60;
        System.out.println(seconds+" seconds are in "+minutes+" minutes");

        //Assignment #5
        int n=0;
        for(int i = 0; i <=4; i++) {
            System.out.print("\n");
            for(int j = 0; j <=n; j++) {
                System.out.print("*");
            }
            n++;

        }





    }
}