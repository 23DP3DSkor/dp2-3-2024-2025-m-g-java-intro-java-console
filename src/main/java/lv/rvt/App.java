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

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadiet pirmo skaitli: ");
        int number1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Ievadiet otro skaitli: ");
        int number2 = Integer.valueOf(scanner.nextLine());
        int summa = number1 + number2;
        int starp = number1 - number2;
        int reiz = number1 * number2;
        double videj = (number1 + number2) / 2;

        System.out.println(number1 + " + " + number2 + " = " + summa);
        System.out.println(number1 + " - " + number2 + " = " + starp);
        System.out.println(number1 + " * " +  number2 + "=" + reiz);
        System.out.println("(" + number1 + "+" +number2 + ") / 2 = " + videj);


        // System.out.println("four: " + 4);
        // int first = 3;
        // int second = 2;
        // double result = first / second;
        // System.out.println(result);
    }
}
