package Jan2025;

import java.sql.SQLOutput;
import java.util.Scanner;

public class lab002_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if(age>18){
            System.out.println("Allowed to vote");
        }

    }
}
