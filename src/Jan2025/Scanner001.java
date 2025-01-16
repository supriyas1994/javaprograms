package Jan2025;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the person \n");
        String name = scanner.next();
        System.out.println(name);
        System.out.println("Enter your age \n");
        int age = scanner.nextInt();
        System.out.println(age);
        System.out.println("Enter you salary \n");
        int salary = scanner.nextInt();
        System.out.println(salary);

    }
}
