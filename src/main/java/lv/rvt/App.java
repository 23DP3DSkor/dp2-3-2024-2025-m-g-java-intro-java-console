package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        // String name = "Dominik";
        // int age = 17;
        // System.out.println(age);
        // System.out.println(name);


    //     String userName = "Dominik";
    //     int userAge = 17;
    //     Boolean userPassword = true;

    //     Scanner scanner = new Scanner(System.in);
    //     String name = scanner.nextLine();
    //     System.out.println(name);

            
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Ievadi savu vardi");
        // String name = scanner.nextLine();
        // System.out.println("Ievadi savu uzvards");
        // String lastName = scanner.nextLine();
        // System.out.println("Ievadi savu grupu");
        // String group = scanner.nextLine();
        // System.out.println(name + lastName + group);

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Ievadiet pirmo skaitli: ");
        // int number1 = Integer.valueOf(scanner.nextLine());
        // System.out.println("Ievadiet otro skaitli: ");
        // int number2 = Integer.valueOf(scanner.nextLine());
        // int summa = number1 + number2;
        // int starp = number1 - number2;
        // int reiz = number1 * number2;
        // double videj = (number1 + number2) / 2;

        // System.out.println(number1 + " + " + number2 + " = " + summa);
        // System.out.println(number1 + " - " + number2 + " = " + starp);
        // System.out.println(number1 + " * " +  number2 + "=" + reiz);
        // System.out.println("(" + number1 + "+" +number2 + ") / 2 = " + videj);


        // System.out.println("four: " + 4);
        // int first = 3;
        // int second = 2;
        // double result = first / second;
        // System.out.println(result);

        //         System.out.println("Hello, world!");
        //         if (true) {
        //             System.out.println("This code is unavoidable!");
        // }
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Give speed: ");
        // int speed = Integer.valueOf(scanner.nextLine());
        // if ( speed > 120){
        //     System.out.println("Speeding ticket!");
        // }
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Give points [0-100]: ");
        // int point = Integer.valueOf(scanner.nextLine());
        // if (point < 0){
        //     System.out.println("Grade: impossible!");
        // }
        // else if (point < 49){
        //     System.out.println("Grade: failed");
        // }
        // else if (point < 59){
        //     System.out.println("Grade: 1");
        // }
        // else if (point < 69){
        //     System.out.println("Grade: 2");
        // }
        // else if (point < 79){
        //     System.out.println("Grade: 3");
        // }
        // else if (point < 89){
        //     System.out.println("Grade: 4");
        // }
        // else if (point <= 100){
        //     System.out.println("Grade: 5");
        // }
        // else{
        //     System.out.println("Grade: incredible!");
        // }
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Value of the gift?");
        // int value = Integer.valueOf(scanner.nextLine());
        // if (value >= 5000 && value <= 25000) {
        //     System.out.println("Tax: " + (100 + (value-5000) * 0.08));
        // }
        // else if (value < 5000){
        //     System.out.println("No tax!");
        // }
        // else if (value >= 25000 && value <= 55000) {
        //     System.out.println("Tax: " + (1700 + (value-25000) * 0.10));
        // }
        // else if (value >= 55000 && value <= 200000) {
        //     System.out.println("Tax: " + (4700 + (value-55000) * 0.12));
        // }
        // else if (value >= 200000 && value <= 1000000) {
        //     System.out.println("Tax: " + (22100 + (value-200000) * 0.15));
        // }
        // else{
        //     System.out.println("Tax: " + (142100 + (value-1000000) * 0.17));
        // }
        // Scanner scanner = new Scanner(System.in);
        // int result = 0;
        // int summa = 0;
        // while (true) {
        //     System.out.println("Give a number: ");
        //     int number = Integer.valueOf(scanner.nextLine());
        //     if (number == 0) {
        //         break;

        //     }
    
        //     if (number > 0) {
        //         result = result + 1;
        //         summa = summa + number;
        //         continue;
        //     }
        //     else{
        //         continue;
        //     }
        // }
        // System.out.println("Number of numbers: " + result);
        // System.out.println("Sum of the numbers: " + summa);


        // Scanner scanner = new Scanner(System.in);
        // System.out.println();
        // int number = scanner.nextInt();
        // for (int i = 0; i <= number; i++) {
        //     System.out.println(i);
        // }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number? ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}