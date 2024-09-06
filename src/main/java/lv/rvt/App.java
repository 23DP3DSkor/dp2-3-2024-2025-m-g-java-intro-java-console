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

            
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadi savu vardi");
        String name = scanner.nextLine();
        System.out.println("Ievadi savu uzvards");
        String lastName = scanner.nextLine();
        System.out.println("Ievadi savu grupu");
        String group = scanner.nextLine();
        System.out.println(name + lastName + group);
    }
}
